def displaying_book():
    
    with open("library.txt","r") as books:
            lines = books.read()
            print(lines)
    

def Creting_list():
    mybookslist = [] # creating empty list
    with open("library.txt","r") as books: # opening text file for..
        ab = books.readlines() # reading text file line by line
        ab = [x.strip('\n') for x in ab] # 
        for line in ab:
            mybookslist.append(line.split(","))
    return mybookslist
    

def Borrowing_Book():
    success = False
    
    while(True):
        username = input("Enter the name of borrower :")
        if username.isalpha():
            break
        print("The username must be alphabets..")
    
    user = "Borrower"+username+".txt"
    with open (user,"w+") as book:
            book.write("Borrower Name:"+username)
      
        
    while success == False:
        bl= Creting_list()
        
        print("Enter the book you want to borrow")
        print()
        for i in range(len(bl)):
            print("Press",i,"for browwing a book",bl[i][0],'\n')
        c = int(input())
        
        if(int(bl[c][2])>0):
            print("Book available")
            with open (user,"a") as book:
                book.write("\na."+bl[c][0]+"\t\t"+bl[c][1]+"\n")
            bl[c][2] = int(bl[c][2])-1 # decreasing quantiy by 1
            with open("library.txt","w") as books: # Writes in txt file
                for i in range (len(bl)):
                     books.write(bl[i][0]+","+bl[i][1]+","+str(bl[i][2])+","+bl[i][3]+"\n")
                     success = True
            print("Thank you for borrowing book")    
                 
def returning_Book():
    username = input("Enter the name of returner: ")
    user = "Borrower"+username+".txt"
    
    userreturn = "Returned by "+username+".txt"
    with open (userreturn,"w+") as book:
        book.write("The book is returned by "+ username+"\n\n")

    with open(user,"r") as book:
        lines = book.readlines()
        lines =[user.strip("$") for apen in lines]
    with open (user,"r") as book:
        Info = book.read()
        print(Info)
                
    
    bl = Creting_list()
    returning = True
    # for i in range(3):
    #     if bl[i][0]  in Info:
    #         with open (userr,"a") as books:
    #             books.write(bl[i][1]+"\t\t"+bl[i][2])
        
    print("Do you want to return the book. Y/N")
    choice = input()
    while returning == True:
        
        if(choice.upper()=="Y"):
            day= int(input("No of days book was borrowed."))
            print("\n")
            price = float(input("Enter the cost of book : "))
            
            #Fine if book is borrowed for more than 10 days
            if(day >10):
                fine = 2*(day-10)
                sum = price
                total = str(fine + sum)
                print("Your fine amount is $",fine)
            else:
                sum = price
                total = str(sum)
            print("Total price of the books is:",total)
            
            print("Thank you for returning the book")
            break
            
            
        elif(choice.upper()=="N"):
            print("Thank you for visitng library")
            break
                
    
    
def Library_Menu():
    
    while(True):
        print("\n                                                 ")
        print("         LIBRARY MANAGEMENT SYSTEM               ")
        print("_________________________________________________\n")
        print('\tEnter 1 : To Display all Books')
        print('\tEnter 2 : To Borrow available Books')
        print("\tEnter 3 : To Return Books")
        print("\tEnter 4 : To Exit")
        print("\n_________________________________________________\n")

        try:
            choice = int(input("Enter a number according to your choice from the above list :"))
            print()
            
            # for display
            if choice == 1:
                displaying_book()
            
            # borrow
            elif choice == 2:
                Creting_list()
                Borrowing_Book()
            
            #return
            elif choice == 3:
                Creting_list()
                returning_Book()
            
            #exit
            elif choice == 4:
                print("Thank you for visting the library")
                break
            
            else:
                print("Incorrect value ")
                

        except ValueError:
            print("Something went wrong with program!!! Wrong Input!")          

Library_Menu()   
        

User(){  
	echo ""   #inorder to give one line gap echo is empty
	echo "!!!!!<<WELCOME>>!!!!!"
	echo "" 
	echo ""
	echo "User name:" $1
	echo ""
	echo "User ID:" $2
	echo ""
	echo "Executed Time is:"$(date) #displays current time and date
	echo ""
	echo ""
}

 #declaring function to choose the band name
BandName(){
	echo "                          <<<<<! IT'S PLAYING TIME !>>>>>"
	echo ""
	echo "                           Band Name     "
        echo ""
        echo "Below are the list of five different legendary Band."
        echo "____________________________"
        echo "|S.N|Band Name        |Code|"
        echo "|___|_________________|____|"
        echo "|1  |Beatles          |BEA |"
        echo "|2  |AC/DC            |AD  |"
        echo "|3  |Queen            |QUE |"
        echo "|4  |Blondie          |BLO |"
        echo "|5  |Nirvana          |NIR |"
        echo "|___|_________________|____|"
        SelectBand   #calling SelectBand function
}

SelectBand(){
	echo "Please insert the Band you like"
	SelectBand=""
	until [[ $SelectBand == QUE ]]    #making Queen as the only one band that should be choossen to move forward
	do
		echo ""
		echo -e "Please!, Enter the band code: \c"
		echo ""
	read SelectBand
	case $SelectBand in
	"BEA") 
	echo "OOPS! Please try choosing another Band:"
	;;
	"AD")
	echo "OOPS! Please try choosing another Band:"
	;;
	"BLO") 
	echo "OOPS! Please try choosing another Band:"
	;;
	"QUE") 
	echo "Congratulation! We have been waiting for this moment: Queen are a British rock band formed in London in 1970. Their classic line-up was Freddie Mercury, Brian May, Roger Taylor and John Deacon.  "
	;;
	"NIR") 
	echo "OOPS! Please try choosing another Band:"
	;;
	*) 
	echo "Sorry! Please check the Band code that we have provided."
	esac
	done
	echo ""
	SingerList
}
SingerList(){
	echo ""
	echo "Below are the list of five singers"
	echo "_____________________________"
	echo "|S.N |Singers          |Code|"
	echo "|____|_________________|____|"
        echo "|1   |John Lennon      |JL  |"
        echo "|2   |Angus Young      |AY  |"
        echo "|3   |Freddie Mercury  |FM  |"
        echo "|4   |Debbie Harry     |DH  |"
        echo "|5   |Kurt Cobain      |KC  |"
        echo "|____|_________________|____|"
	echo ""
        echo "Please! choose 3 singers among these 5 singers"
        echo -e "Please! Enter singer Code with a space seperating the code: \c"
        read S1 S2 S3                #putting value in the variable using read
        choose=($S1 $S2 $S3)
        num=${#choose[@]}
        if [[ ${#choose[@]} -eq 3 ]]
        then
        	if [ $S1 = $S2 ] || [ $S1 = $S3 ] || [ $S2 = $S3 ]
        	then
        		echo -e ""
        		echo -e "You are no allowed to enter the same singer code:"
        		echo -e ""
        		SingerList
        	else
        	 for n in $choose
        	 do
        	 if [[ $n == "JL" || $n == "AY" || $n == "FM" || $n == "DH" || $n == "KC" ]]
        	 then
        	 	continue 	
        	 else
        	 	echo ""
        	 	echo "Please enter valid code that have been provided:"
        	 	SingerList
        	 fi
        	   done
        	 fi
        	 ChoosenSinger 3
        	else
        		echo ""
        		echo -e "\t Please! Enter singer Code that are provided and with a space seperating the code:"
        	 SingerList
        	fi
 }
	
ChoosenSinger(){
	if [ $1 == 3 ] 
	then
		echo ""
		echo "Please, choose any 1 favourite singer among these 3:"
		FS3="Select the singer: "
		select singer in $S1 $S2 $S3 
		do
			case $singer in
			"JL")
			     FileRead John.txt     #reding the files
			     break ;;
			 "AY")
			     FileRead Angus.txt
			     break ;;
			  "FM")
			     FileRead Freddie.txt
			     break ;;
			  "DH")
			     FileRead Debbie.txt
			     break ;;
			  "KC")
			     FileRead Kurt.txt
			     break ;;
			  *)
			  	echo "Invalid input!"
			  	ChoosenSinger 3     #if user inputs invalid number then the loop continues
			  ;;
                     esac
                done
               PlayAgain
           else
                 echo ""
                 echo "Please enter valid input !!!"
                 SingerList
           fi
}
FileRead(){
	if [[ -f $1 ]]
	then
		cat $1
	else
		echo "Sorry! we cannot find the file"
		echo ""
		BandName             #if the file is not available then goes to q4 i.e. to choose country
	fi
}
PlayAgain(){
	echo ""
	echo -e "Do you want to play again? Enter 'yes' to play again and 'no' to quite: \c"
	echo ""
	read answer
	if [ $answer == yes ]    #continue again if  user enters yes
	then
		BandName
	elif [ $answer == no ]    #exit program if user inputs no
	then
		exit
	fi
}
SecretCode=123
if [ $# == 2 ]
then
   while [[ $no -lt 4 ]]   #loop is executed for only 4 times
   do
	echo " 
 \\\///
 | _ _ |
 (| (.)(.) |)
 .---.OOOo--()--oOOO.---.
 | |
 | SECRET KEY? |
 | |
 '---.oooO--------------'
 ( ) Oooo.
 \ ( ( )
 \_) ) /
 (_/
Enter the secret code
 "
	read secretKey
	if [[ $secretKey == $SecretCode ]]
	then
		User $1 $2
		BandName
		break
	else
		echo "Wrong! Please enter the valid secret Key."
		((no++))
	fi
       done
else
	echo "Hi there, PLease!, Enter two parameters i.e. your First Name and ID :)"
        echo " 
 ---PLEASE ENTER THE NAME AND ID ONLY----
 .----------------------------------.
 | |
 EXAMPLE,
 NAME = MANSUK
 ID = 20048454 
 | |
 '----------------------------------' 
Name and ID missing...
 "
fi


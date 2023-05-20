echo "MENU"
echo "1.DISPLAY CALENDAR OF CURRENT MONTH"
echo "2.DISPLAY TODAY'S DATE AND TIME"
echo "3.DISPLAY USERNAMES THOSE ARE CURRENTLY LOGGED IN THE SYSTEM"
echo "4.DISPLAY YOUR NAME AT GIVEN X,Y POSITION"
echo "5.DISPLAY YOUR TERMINAL NUMBER"
echo "6.EXIT"
echo "ENTER YOUR CHOICE"
read c
case $c in
	1) cal;;
	2) date;;
	3) who;;
	4) clear
	echo "ENTER X,Y POSITION"
	read x
	read y
	tput cup $x $y
	whoami;;
	5) tty;;
        6) exit;;
	esac

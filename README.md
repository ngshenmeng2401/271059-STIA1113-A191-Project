# Student Info

Matric: 271059
Name: Ng Shen Meng
Matric: 271780
Name: Chai Jie Sheng
Matric: 271365
Name: Ng Mun Onn
Matric: 271412
Name: Tan Guo Sheng

## Introduction

This assginment are complete by 4 members. This assignment is telling about The Pos Laju Application. The application source code are divided into 6 classes. Which is GroupAssignment1,GroupAssignment2,GroupAssignment3,GroupAssignment4, GroupAssignment5 and main. 
## Pseuducode

```
Pseudocode for main Method

1.	Start
2.	Call method choice()
3.	End

Pseudocode for main.choice Method
1.	Start
2.	Declare classes for groupassignment1, groupassignment2, groupassignment3, groupassignment4 and groupassignment5
3.	Declare variables for choice 
4.	Display “Main Menu”
		4.1	Call line()
		4.2	Display “1.	Next-Day Delivery”
			Display “2.	Same-Day Delivery”
			Display “3.	Prepaid Box and Envelope”
			Display “4.	Pos Express”
			Display “5.	Receipt”
			Display “6.	Exit”
5.	Input choice
6.	IF choice is more than six THEN
		6.1 	Display “Invalid Input”
		6.2	Input choice
7.	IF choice is less than or equal to six THEN
		7.1 	break
	END IF
8.	IF choice is equal to one THEN
		8.1 	Call groupassignment1.choice()
	IF choice is equal to two THEN
		8.2 	Call groupassignment2.choice()
	IF choice is equal to three THEN
		8.3	Call groupassignment3.choice()
IF choice is equal to four THEN
	8.4 	Call groupassignment4.choice()
IF choice is equal to five THEN
	8.4 	Call groupassignment5.receipt()
IF choice is equal to six THEN
	8.4 	Display “Thank You”
END IF
9.	End

 
Pseudocode for groupassignment1.choice Method

1.	Start
2.	Declare class for mainmenu
3.	Declare variable for choice
4.	Display “Menu”
		4.1	Display “1. Input your data”
		4.2	Display “2. Return to Main Menu”
5.	Input choice
6.	IF choice is more than two THEN
		6.1 	Display “Invalid Input”
		6.2	Input choice
7.	IF choice is less than or equal to two THEN
		7.1 	break
	END IF
8.	IF choice is equal to one THEN
		8.1 	Call Table()
			Call Loop()
8.2	IF choice is more than two THEN
				8.2.1 	Display “Invalid Input”
				8.2.2	Input choice
8.3	IF choice is less than or equal to two THEN
				8.3.1 	break
			END IF
9.	IF choice is equal to two THEN
		9.1	Call main.choice
11	END


Pseudocode for groupassignment1.Loop method

1.	Start
2.	Declare variable for zone, customer, packagetype, weight, charge1 and totalcharge1[3].
3.	Initialize customer equal to zero
4.	WHILE customer less than totalcharge1[3].
5.	Display customer
6.	Input first packagetype
7.	Convert packagetype to uppercase
8.	WHILE packagetype not equal to “X”
		8.1	Input weight
		8.2	Input zone
				8.2.1	WHILE zone more than five THEN
					Display “Invalid Input”
					Input zone
				8.2.2	WHILE zone less than or equal to five THEN
					break
9.	Call calCharge method
10.	Display packagetype and charge1
11.	totalcharge1[customer]=totalcharge1[customer]+charge1
12.	Input next packagetype
13.	Convert packagetype to uppercase
14.	Display totalcharge1[customer]
15.	customer=customer+1
16.	End

 
Pseudocode for groupassignment1.calCharge method

1.	Start
2.	Declare variable for charge1.
3.	IF zone is equal to one THEN
		3.1	IF weight is less than two or equal to two thousand THEN
3.1.1	IF weight is less than or equal to two thousand THEN
					charge1=4.90+(weight-500)/250*0.80
3.1.2	IF weight is less than or equal to five hundred THEN
					charge1=4.90
		3.2	IF weight is more than two thousand THEN
3.2.1	IF weight is less than or equal to two thousand five hundred 
					charge1=10.50
				3.2.2	IF weight is more than two thousand five hundred 
					charge1=10.50+(weight-2500)/500*0.50

4.	IF zone is equal to two THEN
		4.1	IF weight is less than or equal to two thousand THEN
4.1.1	IF weight is less than or equal to two thousand THEN
					charge1=5.40+(weight-500)/250*1.00
4.1.2	IF weight is less than or equal to five hundred THEN
					charge1=5.40
		4.2	IF weight is more than two thousand THEN
4.2.1	IF weight is less than or equal to two thousand five hundred 
					charge1=16.00
				4.2.2	IF weight is more than two thousand five hundred 
					charge1=16.00+(weight-2500)/500*2.00

5.	IF zone is equal to three THEN
		5.1	IF weight is less than or equal to two thousand THEN
5.1.1	IF weight is less than or equal to two thousand THEN
					charge1=6.90+(weight-500)/250*1.50
5.1.2	IF weight is less than or equal to five hundred THEN
					charge1=6.90
		5.2	IF weight is more than two thousand THEN
5.2.1	IF weight is less than or equal to two thousand five hundred THEN
					charge1=21.00
5.2.2	IF weight is more than two thousand five hundred THEN
					charge1=21.00+(weight-2500)/500*3.00

6.	 IF zone is equal to four THEN
		6.1	IF weight is less than or equal to two thousand THEN
6.1.1	IF weight is less than or equal to two thousand THEN
					charge1=7.40+(weight-500)/250*1.50
6.1.2	IF weight is less than or equal to five hundred THEN
					charge1=7.40
		6.2	IF weight is more than two thousand THEN
6.2.1	IF weight is less than or equal to two thousand five hundred THEN
					charge1=26.00
6.2.2	IF weight is more than two thousand five hundred THEN
					charge1=26.00+(weight-2500)/500*3.50

7.	IF zone is equal to five THEN
		7.1	IF weight is less than or equal to two thousand THEN
7.1.1	IF weight is less than or equal to two thousand THEN
					charge1=7.90+(weight-500)/250*2.00
7.1.2	IF weight is less than or equal to five hundred THEN
					charge1=7.90
		7.2	IF weight is more than two thousand THEN
7.2.1	IF weight is less than or equal to two thousand five hundred 
					charge1=31.00
				7.2.2	IF weight is more than two thousand five hundred 
					charge1=31.00+(weight-2500)/500*4.00
			END IF
8.	Return charge1
9.	End
 
 
Pseudocode for groupassignment2.choice Method

1.	Start
2.	Declare class for mainmenu
3.	Declare variable for choice
4.	Display “Menu”
		4.1	Display “1. Input your data”
		4.2	Display “2. Return to Main Menu”
5.	Input choice
6.	IF choice is more than two THEN
		6.1 	Display “Invalid Input”
		6.2	Input choice
7.	IF choice is less than or equal to two THEN
		7.1 	break
	END IF
8.	IF choice is equal to one THEN
		8.1 	Call Table()
			Call Loop()
8.2	IF choice is more than two THEN
				8.2.1 	Display “Invalid Input”
				8.2.2	Input choice
8.3	IF choice is less than or equal to two THEN
				8.3.1 	break
			END IF
9.	IF choice is equal to two THEN
		9.1	Call main.choice
11	END
 
 
Pseudocode for groupassignment2.Loop method

1.	Start
2.	Declare variable for towntype, customer, weight, payment and totalcharge2[3].
3.	Initialize customer equal to zero
4.	WHILE customer less than totalcharge2[3].
5.	Display customer
6.	Input first towntype
7.	Convert towntype to uppercase
8.	WHILE towntype not equal to “X”
		8.1	Input weight
				8.2.1	WHILE weight more than one thousand THE
					Display “Invalid Input”
					Input weight
8.2.2	WHILE weight less than or equal to one thousand THEN
					break
9.	Call calPayment
10.	Display payment
11.	totalcharge2[customer]=totalcharge2[customer]+payment
12.	Input next towntype
13.	Convert towntype to uppercase
14	Display totalcharge2[customer]
15.	customer=customer+1
16. 	End		
 
 
Pseudocode for groupassignment2.calPayment method

1.	Start
2.	Declare variable for payment, surcharge and domestic_charge.
3.	IF towntype is equal to “LOCAL” THEN
		3.1	IF weight is less than or equal to five hundred THEN
			domestic_charge=4.90
			surcharge=6.00
3.2	IF weight is more than five hundred and weight is less than or equal to seven hundred fifty THEN
   			domestic_charge=5.70
			surcharge=6.00
3.3	IF weight is more than seven hundred fifty and weight is less than or equal to one thousand THEN
			domestic_charge=6.50
			surcharge=6.00
4.	IF towntype is equal to “CROSS” THEN
		4.1	IF weight is less than or equal to five hundred THEN
			domestic_charge=5.40
			surcharge=7.50
4.2	IF weight is more than five hundred and weight is less than or equal to seven hundred fifty THEN
   			domestic_charge=6.40
			surcharge=7.50
4.3	IF weight is more than seven hundred fifty and weight is less than or equal to one thousand THEN
			domestic_charge=7.40
			surcharge=7.50
	END IF
5.	payment= domestic_charge+ surcharge
6.	Return payment
7.	End


Pseudocode for groupassignment3.choice method

1.	Start
2.	Declare class for mainmenu
3.	Declare variable for choice
4.	Display “Menu”
		4.1	Display “1. Input your data”
		4.2	Display “2. Return to Main Menu”
5.	Input choice
6.	IF choice is more than two THEN
		6.1 	Display “Invalid Input”
		6.2	Input choice
7.	IF choice is less than or equal to two THEN
		7.1 	break
	END IF
8.	IF choice is equal to one THEN
		8.1 	Call Table()
			Call Loop()
8.2	IF choice is more than two THEN
				8.2.1 	Display “Invalid Input”
				8.2.2	Input choice
8.3	IF choice is less than or equal to two THEN
				8.3.1 	break
			END IF
9.	IF choice is equal to two THEN
		9.1	Call main.choice
11	END
 
 
Pseudocode for groupassignment3.Loop method

1.	Start
2.	Declare variable for ItemType, customer, weight, quantity, totalprice and totalcharge3[3].
3.	Initialize customer equal to zero
4.	WHILE customer less than totalcharge3[3].
5.	Display customer
6.	Input first ItemType
7.	Convert ItemType to uppercase
8.	WHILE ItemType not equal to “X”
		8.1	Input quantity
		8.2	Input weight
				8.2.1	WHILE weight more than ten thousand THEN
					Display “Invalid Input”
					Input weight
8.2.2	WHILE weight less than or equal to ten thousand THEN
					Break
9.	Call calTotalPrice
10.	Display totalprice
11.	totalcharge3[customer]=totalcharge3[customer]+totalprice
12.	Input next ItemType
13.	Convert ItemType to uppercase
14.	Display totalcharge3[customer]
15.	customer=customer+1
16.	End

Pseudocode for groupassignment3.calTotalPrice method

1.	Start
2.	Declare variables for price and totalprice
3.	IF weight less than or equal to five hundred THEN
		3.1	price = 7.31
4.	IF weight more than five hundred and less than or equal to one thousand THEN
		4.1	price = 10.49
5.	IF weight more than one thousand and less than or equal to two thousand THEN
		5.1	price = 13.78
6.	IF weight more than two thousand and less than or equal to five thousand THEN
		6.1	price = 21.20
7.	IF weight more than five thousand and less than or equal to ten thousand THEN
		7.1	price = 31.80
	END IF
8.	totalprice=price*quantity
9. 	Return totalprice
10.	End
 
 
 Pseudocode for groupassignment4.choice method

1.	Start
2.	Declare class for mainmenu
3.	Declare variable for choice
4.	Display “Menu”
		4.1	Display “1. Input your data”
		4.2	Display “2. Return to Main Menu”
5.	Input choice
6.	IF choice is more than two THEN
		6.1 	Display “Invalid Input”
		6.2	Input choice
7.	IF choice is less than or equal to two THEN
		7.1 	break
	END IF
8.	IF choice is equal to one THEN
		8.1 	Call Table()
			Call Loop()
8.2	IF choice is more than two THEN
				8.2.1 	Display “Invalid Input”
				8.2.2	Input choice
8.3	IF choice is less than or equal to two THEN
				8.3.1 	break
			END IF
9.	IF choice is equal to two THEN
		9.1	Call main.choice
11	END
 
 
Pseudocode for groupassignment4.Loop method

1.	Start
2.	Declare variables for quantity, customer, ItemType, weight, totalprice and totalcharge4[3]
3.	Initialize customer equal to zero
4.	WHILE customer less than totalcharge4[3].
5.	Display customer
6.	Input first ItemType
7.	Convert ItemType to uppercase
8.	WHILE ItemType not equal to “X”
		8.1	Input quantity
		8.2	Input weight
				8.2.1	WHILE weight more than one thousand THEN
					Display “Invalid Input”
					Input weight
8.2.2	WHILE weight less than or equal to one thousand THEN
					Break
9.	Call calTotalPrice
10.	Display totalprice
11.	totalcharge4[customer]=totalcharge4[customer]+totalprice
12.	Input next ItemType
13.	Convert ItemType to uppercase
14.	Display totalcharge4[customer]
15.	customer=customer+1
16.	End
 
 
Pseudocode for groupassignment4.calTotalPrice method

1.	Start
2.	Declare variables for price and totalprice
3.	IF weight less than or equal to one hundred THEN
		3.1	price = 3.18
4.	IF weight more than one hundred and less than or equal to two hundred fifty THEN
		4.1	price = 3.71
5.	IF weight more than two hundred fifty and less than or equal to five hundred THEN
		5.1	price = 4.77
6.	IF weight more than five hundred and less than or equal to one thousand THEN
		6.1	price = 7.42
	END IF
7.	totalprice=price*quantity
8.	Return totalprice
9.	End
 
 
Pseudocode for groupassignment5.receipt method

1. 	Start 
2.	Declare variable for totalcharge1[3], totalcharge2[3], totalcharge3[3] and totalcharge4[3], customer, choice and grandtotal
3.	Display “Menu”
		3.1	Display “1. Display Receipt”
		3.2	Display “2. Return to Main Menu”
4.	Input choice
5.	IF choice is more than two THEN
		5.1 	Display “Invalid Input”
		5.2	Input choice
6.	IF choice is less than or equal to two THEN
		6.1 	break
	END IF
7.	IF choice is equal to one THEN
		7.1	customer equal to zero
		7.2	WHILE customer less than totalcharge1[3]
				7.2.1	Display customer
7.2.2	grandtotal= totalcharge1[3] + totalcharge2[3] + totalcharge3[3] + totalcharge4[3]
7.2.3	Display “Total Charge”
7.2.4	Display totalcharge1[customer]
7.2.5	Display totalcharge2[customer]
7.2.6	Display totalcharge3[customer]
7.2.7	Display totalcharge4[customer]
7.2.8	Display grandtotal
		7.3	Input choice
		7.4	IF choice is more than two THEN
				7.4.1	Display “Invalid Input”
				7.4.2	Input choice


		7.5	IF choice is less than or equal to two THEN
				7.5.1	break
			END IF
8.	IF choice is equal to two
		8.1	Call main.choice
9.	End
```
## Flowchart

![Flowchart](https://github.com/ngshenmeng2401/271059-STIA1113-A191-Project/blob/master/main.png)
![Flowchart](https://github.com/ngshenmeng2401/271059-STIA1113-A191-Project/blob/master/GroupAsignment1.png)
![Flowchart](https://github.com/ngshenmeng2401/271059-STIA1113-A191-Project/blob/master/GroupAssignment2.png)
![Flowchart](https://github.com/ngshenmeng2401/271059-STIA1113-A191-Project/blob/master/GroupAssignment3.png)
![Flowchart](https://github.com/ngshenmeng2401/271059-STIA1113-A191-Project/blob/master/GroupAssignment4.png)
![Flowchart](https://github.com/ngshenmeng2401/271059-STIA1113-A191-Project/blob/master/GroupAssignment5.png)

## Screenshot of the output

![output](https://github.com/ngshenmeng2401/271059-STIA1113-A191-Project/blob/master/Output1.png)
![output](https://github.com/ngshenmeng2401/271059-STIA1113-A191-Project/blob/master/Output2.png)
![output](https://github.com/ngshenmeng2401/271059-STIA1113-A191-Project/blob/master/Output3.png)
![output](https://github.com/ngshenmeng2401/271059-STIA1113-A191-Project/blob/master/Output4.png)
![output](https://github.com/ngshenmeng2401/271059-STIA1113-A191-Project/blob/master/Output5.png)
![output](https://github.com/ngshenmeng2401/271059-STIA1113-A191-Project/blob/master/Output6.png)
![output](https://github.com/ngshenmeng2401/271059-STIA1113-A191-Project/blob/master/Output7.png)
![output](https://github.com/ngshenmeng2401/271059-STIA1113-A191-Project/blob/master/Output8.png)
![output](https://github.com/ngshenmeng2401/271059-STIA1113-A191-Project/blob/master/Output9.png)
![output](https://github.com/ngshenmeng2401/271059-STIA1113-A191-Project/blob/master/Output10.png)
![output](https://github.com/ngshenmeng2401/271059-STIA1113-A191-Project/blob/master/Output11.png)

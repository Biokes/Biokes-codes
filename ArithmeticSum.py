number1 = int(input("enter the first number: "))
number2 = int(input("enter the second  number: "))
number3 = int(input("enter the third number: "))
if number1 >= number2 and number1 >= number3:
	great = number1
if number2 >= number1 and number2 >= number3:
	great = number2
if number3 >= number1 and number3 >= number2:
	great = number3
if number1 <= number2 and number1 <= number3:
	least = number1
if number2 <= number1 and number2 <= number3:
	least = number2
if number3 <= number1 and number3 <= number2:
	least = number3
sum = number1 + number2 + number3
print('the sum of the three numbers is ' ,sum)
print('the largest number is ', great)
print('the least number is ', least)

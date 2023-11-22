num = int(input('pls enter a five digit number: ')) 
if num//10000 >= 10:
	print('this is not a five digit number')
if num//10000 < 1:
	print('this is not a five digit number')
if num//10000 <= 9 and num//10000 >= 1:
	number1 =(num//10000)
number2 = (num//1000)
numbers2=(number2%10)
number3 = (num//100)
numbers3 = (number3%10)
number4= (num%100)
numbers4 = (number4//10)
number5= (num%10)
print(number1,'   ',numbers2,'   ',numbers3,'   ',numbers4,'   ',number5)

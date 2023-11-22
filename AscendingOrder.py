max= 0
min = 0
mid = 0
num1 = int(input('pls enter number 1: '))
num2 = (int(input('pls enter number 2: ')))
num3 = (int(input('pls enter number 3: ')))
if num1>= num2 and num1>= num3:
	max = num1
if num2>= num1 and num2>= num3:
	max = num1
if num3>= num2 and num3>= num1:
	max = num1
if num1<= num2 and num1<= num3:
	min = num1
if num2<= num1 and num2<= num3:
	min = num1
if num3<= num2 and num3<= num1:
	min = num1
if num1 >= max and num2 >= min:
	mid =num3
if num1 >= max and num3 >= min:
	mid =num2
if num2 >= max and num1 >= min:
	mid =num3
if num2 >= max and num3 >= min:
	mid =num2
if num3 >= max and num1 >= min:
	mid =num2
if num3 >= max and num2 >= min:
	mid =num2
print('the ascending order of the above entered number is',min,',',mid,',',max)
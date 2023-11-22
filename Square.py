number = (int(input('please enter a number')))
numSqr = (number**2)
if numSqr > 100 and number > 100:
	print('the number and the square is greater than 100')
if numSqr < 100 and number < 100:
	print('the number and the square is less than 100')
elif numSqr > 100 and number < 100:
	print('the number is less than 100 and the square is greater than 100')

password=input('enter your password:')
num =len(password)
if num< 12:
	print('Enter a password greater than 12 characters or equal to 12 characters')
else:
	 (print(f'the length of your password is {num} characters' ),
print(num* '*'))
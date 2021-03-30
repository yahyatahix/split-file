import sys

with open(sys.argv[1]) as data:
	
	op=''
	start=0
	compteur=1

	for x in data.read().split("\n"):
		if(start):
			op = op + '\n' + x

		if(x!=' ' and len(x) > 2):

			if(x[0]=='9' and x[1]=='2' ) :
				print("komoro1")
				start = 1
				op = op + '\n' + x
				with open(str(compteur) + '.txt', 'w') as outputfile:
					print("komoro2")
					outputfile.write(op)
					op=''
			if(x[0]=='9' and x[1]=='3'):
				with open(str(compteur) + '.txt', 'a') as outputfile:
					print("komoro3")
					outputfile.write(op)
					outputfile.close()
					op=''
					start=0
					compteur=compteur+1


			if(x[0]=='9' and x[1]=='4' ) :
				print("komoro1")
				start = 1
				op = op + '\n' + x
				with open(str(compteur) + '.txt', 'w') as outputfile:
					print("komoro2")
					outputfile.write(op)
					op=''
			if(x[0]=='9' and x[1]=='5'):
				with open(str(compteur) + '.txt', 'a') as outputfile:
					print("komoro3")
					outputfile.write(op)
					outputfile.close()
					op=''
					start=0
					compteur=compteur+1


			if(x[0]=='9' and x[1]=='6' ) :
				print("komoro1")
				start = 1
				op = op + '\n' + x
				with open(str(compteur) + '.txt', 'w') as outputfile:
					print("komoro2")
					outputfile.write(op)
					op=''
			if(x[0]=='9' and x[1]=='7'):
				with open(str(compteur) + '.txt', 'a') as outputfile:
					print("komoro3")
					outputfile.write(op)
					outputfile.close()
					op=''
					start=0
					compteur=compteur+1


			if(x[0]=='9' and x[1]=='8' ) :
				print("komoro1")
				start = 1
				op = op + '\n' + x
				with open(str(compteur) + '.txt', 'w') as outputfile:
					print("komoro2")
					outputfile.write(op)
					op=''
			if(x[0]=='9' and x[1]=='9'):
				with open(str(compteur) + '.txt', 'a') as outputfile:
					print("komoro3")
					outputfile.write(op)
					outputfile.close()
					op=''
					start=0
					compteur=compteur+1

					
			if(x[0]=='8' and x[1]=='0' ) :
				print("komoro1")
				start = 1
				op = op + '\n' + x
				with open(str(compteur) + '.txt', 'w') as outputfile:
					print("komoro2")
					outputfile.write(op)
					op=''
			if(x[0]=='8' and x[1]=='1'):
				with open(str(compteur) + '.txt', 'a') as outputfile:
					print("komoro3")
					outputfile.write(op)
					outputfile.close()
					op=''
					start=0
					compteur=compteur+1

	data.close()	
		
				

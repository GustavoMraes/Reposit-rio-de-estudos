import mysql.connector 

mybd = mysql.connect(
             host="127.0.0.1", 
             user="root", 
             passwd="root",
             db="python"
)

print (mybd)
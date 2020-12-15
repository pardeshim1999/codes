class Empclass:
	empcount=0

	def __init__(self,name,salary):
		self.name= name
		self.salary= salary
		Empclass.empcount += 1

	def displaycount(self):
		print "total employee "% Empclass.empcount

	def displayemployee(self):
		print "name :", self.name
		print "salary: ", self.salary

emp1= Empclass("manish",500)
emp2= Empclass("abhi",600)

emp1.displayemployee()
emp2.displayemployee()

print "total employee:"% Empclass.empcount

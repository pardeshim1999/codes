dic={"name":"manish","middle name":"vijay","surname":"pardeshi","age":7}

print "dic['name']:",dic['name']
print "dic['middle name']:",dic['middle name']
print "dic['surname']:",dic['surname']
print "dic['age']:",dic['age']

#updating elements
dic['age']=8

#adding new element
dic['college']="Sapkal"

print "dic['age']:",dic["age"]
print "dic['college']:",dic["college"]

#deleting element
del dic['college']
print dic

#clearing all elements
#dic.clear()
#print dic

#delete entire directory
#del dic
#print dic

#comparing multiple directory
dic1={"name":"abhi","age":22}
dic2={"name":"manish","age":23}
dic3={"name":"pratiksha","age":23}
dic4={"name":"abhi","age":22}

print "cmp dic1,dic2:",cmp(dic1,dic2)
print "cmp dic2,dic3:",cmp(dic2,dic3)
print "cmp dic3,dic4:",cmp(dic3,dic4)
print "cmp dic1,dic4:",cmp(dic1,dic4)


print"length dic=",len(dic)

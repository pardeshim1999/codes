a=10;
b=20;
c=30;
d=40;

print"A=",a
print"B=",b
print"C=",c
print"D=",d

if((a==b) and (c==d)):
	print"(a==b) && (c==d) is right"
else:
	print"(a==b) && (c==d) is wrong"
if((a!=b) and (c==d)):
        print"(a!=b) && (c==d) is right"
else:
        print"(a!=b) && (c==d) is wrong"
if((a==b) and (c!=d)):
        print"(a==b) && (c!=d) is right"
else:
        print"(a==b) && (c!=d) is wrong"
if((a!=b) and (c!=d)):
        print"(a!=b) && (c!=d) is right"
else:
        print"(a!=b) && (c!=d) is wrong"

if((a==b) or (c==d)):
	print"(a==b) ||	(c==d) is right"
else:
	print"(a==b) || (c==d) is wrong"
if((a!=b) or (c==d)):
        print"(a!=b) || (c==d) is right"
else:
        print"(a!=b) || (c==d) is wrong"
if((a==b) or (c!=d)):
        print"(a==b) || (c!=d) is right"
else:
        print"(a==b) || (c!=d) is wrong"
if((a!=b) or (c!=d)):
        print"(a!=b) || (c!=d) is right"
else:
        print"(a!=b) || (c!=d) is wrong"

if(not((a==b) and (c==d))):
	print"!((a==b) && (c==d)) is right"
else:
	print"!((a==b) && (c==d)) is wrong"
if(not((a!=b) and (c==d))):
        print"!((a!=b) && (c==d)) is right"
else:
        print"!((a!=b) && (c==d)) is wrong"
if(not((a==b) and (c!=d))):
        print"!((a==b) && (c!=d)) is right"
else:
        print"!((a==b) && (c!=d)) is wrong"
if(not((a!=b) and (c!=d))):
        print"!((a!=b) && (c!=d)) is right"
else:
        print"!((a!=b) && (c!=d)) is wrong"

if(not((a==b) or (c==d))):
        print"!((a==b) || (c==d)) is right"
else:
        print"!((a==b) || (c==d)) is wrong"
if(not((a!=b) or (c==d))):
        print"!((a!=b) || (c==d)) is right"
else:
        print"!((a!=b) || (c==d)) is wrong"
if(not((a==b) or (c!=d))):
        print"!((a==b) || (c!=d)) is right"
else:
        print"!((a==b) || (c!=d)) is wrong"
if(not((a!=b) or (c!=d))):
        print"!((a!=b) || (c!=d)) is right"
else:
        print"!((a!=b) || (c!=d)) is wrong"



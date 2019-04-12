import string
import os
import csv


def csv_file(l,name):
    with open(name,mode="w") as csv_file:
        fieldnames=["Line number","hit"]
        writer = csv.DictWriter(csv_file, fieldnames=fieldnames)
        writer.writeheader()
        for i in l:
            writer.writerow(i)
     


def d_format(lst):
    l=[]
    for i in lst.keys():
        d={}
        d["Line number"]=i
        d["hit"]=lst[i]
        l.append(d)
    return l


def parse_file(name):
    lst = {}
    fl = open(name,"r")

    for l in fl.readlines():       
        info = l.split('''"''')
        if int(info[3])>=1:
            if int(info[1]) in lst:
                lst[int(info[1])]+=1
            else:
                lst[int(info[1])]=1
    return lst


def main():
    d = parse_file("lines_f_1.xml")
    l = d_format(d)
    csv_file(l,"file.csv")
 

if __name__ == "__main__":
    main()
    

import string
import os

def replace_line():
    f = open("tests.txt","r")
    lst=[]
    s=''
    for line in f:
        
        count = 0
        length=len(line)
        for cha in line:
            if cha=='(':
                break
            else:
                count+=1
        s+=line[count+1:length-3]+"::"+line[0:count]+'\n'
        lst.append(line[count+1:length-3]+"::"+line[0:count])
    f = open("tests.txt", "w")
    f.write(s)
    return lst
       
def coverage(lst):
    count=1
    for line in lst:
        os.system("defects4j coverage -t "+ line)
        os.system("cat coverage.xml>coverage_p_"+str(count)+".xml")
        count+=1
    
    
def main():
    lst = replace_line()
    coverage(lst)


if __name__ == "__main__":
    main()





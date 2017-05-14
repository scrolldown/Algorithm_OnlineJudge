# -*- coding: utf-8 -*-


count = input() # 몇번 정수 입력 할것인지 ?

inputData=[] #

for data in range(0,count): # count만큼 반복할 것.
    isHoemoonin = 1
    scanData = input()
    inputData.insert(data,scanData)
    
for scanData in inputData:
    for notation in range(2,65):
        s=[]
        a=scanData
        while a > 0:
            a,r = divmod(a,notation)
            if (r>9):
                r=chr(ord('a')+r-10)
                s.insert(0,str(r))
            else :
                s.insert(0,str(r))

        compareDigitNumber=len(s)-1
        while compareDigitNumber!=len(s)/2+len(s)%2-2:
            if s[len(s)-compareDigitNumber-1]==s[compareDigitNumber]:
                isHoemoonin=1
                compareDigitNumber=compareDigitNumber-1
            else :
                isHoemoonin=0
                break
        
        if (isHoemoonin):
            print isHoemoonin
            break
        elif notation==64 and isHoemoonin==False:
            print isHoemoonin


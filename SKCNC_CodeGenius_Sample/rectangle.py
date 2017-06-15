#-*- coding: utf-8 -*-

def solution(v):
    # 두번 입력된 수를 제외한 나머지 한개의 수를 반환하는 방식으로 해결
    answer = []    
    if (v[0][0]!=v[1][0] and v[0][0]!=v[2][0]):
        answer.append(v[0][0])
    elif (v[0][0]!=v[1][0] and v[0][0]==v[2][0]):
        answer.append(v[1][0])
    elif (v[0][0]==v[1][0] and v[0][0]!=v[2][0]):
        answer.append(v[2][0])
        
    if (v[0][1]!=v[1][1] and v[0][1]!=v[2][1]):
        answer.append(v[0][1])
    elif (v[0][1]!=v[1][1] and v[0][1]==v[2][1]):
        answer.append(v[1][1])
    elif (v[0][1]==v[1][1] and v[0][1]!=v[2][1]):
        answer.append(v[2][1])
    return answer

v=input()

print(solution(v))

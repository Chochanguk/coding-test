# 리스트 생성
stack = []

stack.append(5)
stack.append(2)
stack.append(3)
stack.append(7)

stack.pop()

stack.append(1)
stack.append(4)
stack.pop()

print(stack)  # 최하단보기
print(stack[::-1])  # 최상단 보기 원래스택처럼 보기

class Solution:
    def decodeString(self, s: str) -> str:

        stack = []
        curNum = 0
        curStr = ''
        for letter in s:
            if letter == '[':
                stack.append(curNum)
                stack.append(curStr)
                curNum = 0
                curStr = ''
            elif letter == ']':
                strs = stack.pop()
                num = stack.pop()
                curStr = strs + num*curStr
            elif letter.isdigit():
                curNum = curNum*10 + int(letter)
            else:
                curStr+= letter
        return curStr
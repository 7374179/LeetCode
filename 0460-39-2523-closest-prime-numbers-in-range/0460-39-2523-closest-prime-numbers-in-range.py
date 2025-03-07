class Solution:
    def closestPrimes(self, left: int, right: int) -> List[int]:
        arr = [-1,-1]
        min = float('inf')
        tmp1 = 0
        tmp2 = 0
        for i in range(left, right+1):
            if(self.isPrime(i)):
                if tmp1==0 and tmp2==0:
                    tmp1 = i
                elif tmp1!=0 and tmp2 ==0:
                    tmp2 = i
                    min = tmp2-tmp1
                    arr[0] = tmp1
                    arr[1] = tmp2
                elif tmp1!=0 and tmp2!=0:
                    tmp1 = tmp2
                    tmp2 = i
                    if min==tmp2-tmp1:
                        continue
                    if min>tmp2-tmp1:
                        min = tmp2-tmp1
                        arr[0] = tmp1
                        arr[1] = tmp2
        return arr

    def isPrime(self, num:int) -> bool:
        if(num<=1): return False
        if(num==2): return True
        if(num%2==0): return False
        for j in range(3, int(math.sqrt(num))+1, 2):
            if num % j == 0:
                return False
        return True

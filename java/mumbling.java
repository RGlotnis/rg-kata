def accum(s):
    n = 0
    ans = ""
    for i in s:
        if n>0:
            ans+="-"
        ans+=i.upper()
        for _ in xrange(n):
            ans+=i.lower()
        n+=1    
    return ans

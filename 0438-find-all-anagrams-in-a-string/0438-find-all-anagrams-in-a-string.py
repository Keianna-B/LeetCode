class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        if len(p)>len(s):
            return[]
        dic_p= {}
        for i in p:
            if i in dic_p:
                dic_p[i] += 1
            else:
                dic_p[i] = 1

        ans = []
        dic_s = {}

        for i in range(len(s)):
            if s[i] in dic_s:
                dic_s[s[i]] += 1
            else:
                dic_s[s[i]] = 1

            if i >= len(p):
                if dic_s[s[i-len(p)]] == 1:
                    del dic_s[s[i-len(p)]]
                else:
                    dic_s[s[i-len(p)]] -= 1
            if dic_s == dic_p:
                ans.append(i-len(p)+1)

        return ans


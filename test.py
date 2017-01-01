# -*- coding: utf-8 -*-
"""
Created on Wed Sep 21 22:51:55 2016

@author: USER
"""
time = input().strip()
l = len(time)
f = time[l-2:]
    
if (f=="PM"):
    h = int(time[:2])
    h += 12
    if (h==12):
        h-=12
    h = str(h)
    time = h+time[2:-2]
else:
    h = int(time[:2])
    if (h==12):
        time = "00" + time[2:-2]
    else:
        time = time[:-2]
print(time)
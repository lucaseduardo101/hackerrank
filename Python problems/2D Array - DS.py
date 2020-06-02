#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the hourglassSum function below.
def hourglassSum(arr):
    matrizAux=[]
    lines_size = len(arr)
    column_size = len(arr[0])
    for i in range(lines_size-2):
        matrizAuxLine=[]
        for j in range(column_size-2):  
            auxLine=None                    
            auxLine = arr[i][j] + arr[i][j+1] + arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1] + arr[i+2][j+2]                                
            matrizAuxLine.append(auxLine)
            
            if(i==0 and j==0): aux = auxLine
            if(auxLine > aux):
                aux = auxLine                         
        matrizAux.append(matrizAuxLine)
    return aux

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr = []

    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))

    result = hourglassSum(arr)

    fptr.write(str(result) + '\n')

    fptr.close()

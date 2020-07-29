def merge(a,b):
    i = 0
    j = 0
    k = 0
    result = [None]* (len(a)+len(b))

    while i < len(a) and j < len(b):
        if a[i] < b[j]:
            result[k] = a[i]
            i = i+1
            k=k+1
        else:
            result[k] = b[j]
            j=j+1
            k=k+1

    while i < len(a):
        result[k] = a[i]
        i+=1
        k+=1
    while j < len(b):
        result[k] = b[j]
        k+=1
        j+=1

    return result

def merge_sort(array):
    if len(array)<=1:
        return array
    left, right = merge_sort(array[:len(array)//2]), merge_sort(array[len(array)//2:])
    return merge(left, right)


arr = [253,5545,23,65,246,64,123,723,71,12,54,72,24,56,98,42]
print(arr)
sorted = merge_sort(arr)
print(sorted)

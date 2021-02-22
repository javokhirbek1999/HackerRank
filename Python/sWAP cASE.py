def swap_case(d):
    t = ""
    for i in d:
        if str(i).isupper():
            t = t + i.lower()
        elif str(i).islower():
            t = t + i.upper()
        else:
            t = t + i
    return t


if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)

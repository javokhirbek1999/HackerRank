from decimal import Decimal
if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    sol = Decimal(str("%.2f" % (sum(student_marks.get(query_name))/3))).quantize(Decimal('.01'))
    print(sol)
    

if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    result={}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
if query_name in student_marks.keys():
    s=sum(student_marks[query_name])
    avg=(s/len(student_marks[query_name]))
   # res=round(avg,2)
    print("{:.2f}".format(avg))

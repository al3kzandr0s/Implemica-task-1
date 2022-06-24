# Implemica-task-1
Если мы из корректно записанного арифметического выражения, содержащего числа, знаки операций и открывающие и закрывающие круглые скобки выбросим числа и знаки операций, а затем запишем оставшиеся в выражении скобки без пробелов между ними, то полученный результат назовем правильным скобочным выражением [скобочное выраж	ение "(()(()))" - правильное, а "()(" и "())(" - нет].
Найти число правильных скобочных выражений, содержащих N открывающихся и N закрывающихся скобок. N вводится с клавиатуры. N неотрицательное целое число.

Пример:
N =  1 (по одной скобке открывающейся и закрывающейся) - ответ 1
()
)(
))
((
Только один правильный вариант

Для введенного числа 2 - 2 :
()()
(())
То есть только два варианта, когда все открытые скобки правильно открываются/закрываются.
И так далее.

# Result:
For example, after getting the text asking for input, we can enter any positive integer, so let's enter 10, and after that, we get the result saying that 16796 variants are possible for 10 parentheses:

![image](https://user-images.githubusercontent.com/87822132/175651917-1dfd2de9-36f9-4d10-9aec-f8c7072d9df2.png)

Also, by using JUnit4 we can create some tests to verify the answers by comparing them to the Catalan numbers:

![image](https://user-images.githubusercontent.com/87822132/175651660-99032593-3574-4dda-9b19-4df200b62623.png)

As a result, we got 100% success on our tests, and the most important parts of code were tested. 

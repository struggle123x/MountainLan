package assignment2;

public class Counter {
    public Counter() {
    }

    public double calculate(String expression) {
        double result = 0;
        String multiplyResult, divisionResult, addResult, subtractResult, bracketResult;

        //先计算括号内的表达式
        bracketResult = bracket(expression);
        //再计算乘法部分
        multiplyResult = multiply(bracketResult);
        //然后计算除法内容
        divisionResult = division(multiplyResult);
        //然后计算减法
        subtractResult = subtract(divisionResult);
        //最后计算加法
        addResult = add(subtractResult);

        //最后进行的加法运算的结果即为整个表达式的结果,用包装类转换成double类型的数据
        result = Double.parseDouble(addResult);

        //最后，函数返回结果
        return result;
    }

    public String bracket(String expression) {
        //定义两个int变量，来记录“（” 和“）”的index
        int leftBound = 0, rightBound = 0;
        String string = null;

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                leftBound = i;
            }

            if (expression.charAt(i) == ')') {
                rightBound = i;

                //判断索引是否越界
                if (leftBound < expression.length() && rightBound <= expression.length() - 1) {
                    //计算括号中的表达式，并转换成字符串
                    String substitute = String.valueOf(calculate(expression.substring(leftBound + 1, rightBound)));

                    //用上一步得到的字符串代替原先的表达式部分，比如：（3+2）*5，用字符串“5”代替（3+2）
                    string = expression.replace('(' + expression.substring(leftBound + 1, rightBound) + ')', substitute);
                }
                break;
            }
            //如果没有检测到括号，则直接返回原字符串
            else {
                return expression;
            }
        }

        return string;
    }

    public String multiply(String expression) {
        //记录乘号左右两边的数值
        double leftValue = 0, rightValue = 0;
        //记录乘法结果
        double multiplyResult = 0;
        //记录乘号位置，以及乘法式子的左右边界的index
        int multiplyIndex = 0, leftBound = 0, rightBound = 0;
        //定义一个boolean变量，来判断这个乘法的式子是不是在表达式的最后一部分，比如：（3+2）*5，此时乘法部分就是在表达式最后
        boolean judge = false;

        for (int i = 1; i < expression.length() - 1; i++) {
            if (expression.charAt(i) == '*') {
                //检测到乘号，并记录index
                multiplyIndex = i;
                //遍历乘号左边的内容，来找到左边界索引
                for (int j = multiplyIndex - 1; j >= 0; j--) {
                    if (!Character.isDigit(expression.charAt(j))) {
                        leftBound = j;
                        break;
                    }
                }
                //遍历乘号右边的内容，找到有边界的索引
                for (int k = multiplyIndex + 1; k < expression.length(); k++) {
                    if (!Character.isDigit(expression.charAt(k))) {
                        rightBound = k;
                        break;
                    }
                }
            }
            //如果没有检测到乘号，则直接返回原字符串，该方法结束
            else
                return expression;

            //如果右边界值为字符串最大的index，则说明该乘法部分在表达式的最后那一部分了，就把true赋值给judge变量
            if (rightBound == expression.length() - 1)
                judge = true;

        }

        //乘号部分左边的数值，比如：3*5，leftValue就为3
        leftValue = Double.parseDouble(expression.substring(leftBound, multiplyIndex));
        //如果judge为true，即该乘法部分在表达式的最后那一部分，则截取字符串的时候，就只需要输入一个索引值了，一直截取到最后
        if (judge)
            rightValue = Double.parseDouble(expression.substring(multiplyIndex + 1));
        else
            rightValue = Double.parseDouble(expression.substring(multiplyIndex + 1, rightBound + 1));

        //左右两部分数值相乘得到结果
        multiplyResult = leftValue * rightValue;

        //这里judge的作用同上，也是为了更准确地截取字符串
        if (judge) {
            return expression.replace(expression.substring(leftBound), String.valueOf(multiplyResult));
        }
        return expression.replace(expression.substring(leftBound, rightBound + 1), String.valueOf(multiplyResult));

    }

    public String add(String expression) {
        double leftValue = 0, rightValue = 0;
        double addResult = 0;
        int addIndex = 0, leftBound = 0, rightBound = 0;
        boolean judge = false;

        for (int i = 1; i < expression.length() - 1; i++) {
            if (expression.charAt(i) == '+') {
                addIndex = i;
                for (int j = addIndex - 1; j >= 0; j--) {
                    if (!Character.isDigit(expression.charAt(j))) {
                        leftBound = j;
                        break;
                    }
                }
                for (int k = addIndex + 1; k < expression.length(); k++) {
                    if (!Character.isDigit(expression.charAt(k))) {
                        rightBound = k;
                        break;
                    }
                }
            } else
                return expression;

            if (rightBound == expression.length() - 1)
                judge = true;

        }

        leftValue = Double.parseDouble(expression.substring(leftBound, addIndex));
        if (judge)
            rightValue = Double.parseDouble(expression.substring(addIndex + 1));
        else
            rightValue = Double.parseDouble(expression.substring(addIndex + 1, rightBound + 1));

        addResult = leftValue + rightValue;

        if (judge) {
            return expression.replace(expression.substring(leftBound), String.valueOf(addResult));
        }
        return expression.replace(expression.substring(leftBound, rightBound + 1), String.valueOf(addResult));
    }

    public String division(String expression) {
        double leftValue = 0, rightValue = 0;
        double divisionResult = 0;
        int divisionIndex = 0, leftBound = 0, rightBound = 0;
        boolean judge = false;

        for (int i = 1; i < expression.length() - 1; i++) {
            if (expression.charAt(i) == '/') {
                divisionIndex = i;
                for (int j = divisionIndex - 1; j >= 0; j--) {
                    if (!Character.isDigit(expression.charAt(j))) {
                        leftBound = j;
                        break;
                    }
                }
                for (int k = divisionIndex + 1; k < expression.length(); k++) {
                    if (!Character.isDigit(expression.charAt(k))) {
                        rightBound = k;
                        break;
                    }
                }
            } else
                return expression;

            if (rightBound == expression.length() - 1)
                judge = true;

        }

        leftValue = Double.parseDouble(expression.substring(leftBound, divisionIndex));
        if (judge)
            rightValue = Double.parseDouble(expression.substring(divisionIndex + 1));
        else
            rightValue = Double.parseDouble(expression.substring(divisionIndex + 1, rightBound + 1));

        //检测表达式中除数是否为0
        try {
            if (rightValue != 0) {
                divisionResult = leftValue / rightValue;
            } else {
                throw new ExpressionFormatException("除数不能为0");
            }
        } catch (ExpressionFormatException e) {
            e.getMessage();
        }

        if (judge) {
            return expression.replace(expression.substring(leftBound), String.valueOf(divisionResult));
        }
        return expression.replace(expression.substring(leftBound, rightBound + 1), String.valueOf(divisionResult));

    }

    public String subtract(String expression) {
        double leftValue = 0, rightValue = 0;
        double subtractResult = 0;
        int subtractIndex = 0, leftBound = 0, rightBound = 0;
        boolean judge = false;

        for (int i = 1; i < expression.length() - 1; i++) {
            if (expression.charAt(i) == '-') {
                subtractIndex = i;
                for (int j = subtractIndex - 1; j >= 0; j--) {
                    if (!Character.isDigit(expression.charAt(j))) {
                        leftBound = j;
                        break;
                    }
                }
                for (int k = subtractIndex + 1; k < expression.length(); k++) {
                    if (!Character.isDigit(expression.charAt(k))) {
                        rightBound = k;
                        break;
                    }
                }
            } else
                return expression;

            if (rightBound == expression.length() - 1)
                judge = true;

        }

        leftValue = Double.parseDouble(expression.substring(leftBound, subtractIndex));
        if (judge)
            rightValue = Double.parseDouble(expression.substring(subtractIndex + 1));
        else
            rightValue = Double.parseDouble(expression.substring(subtractIndex + 1, rightBound + 1));

        subtractResult = leftValue - rightValue;

        if (judge) {
            return expression.replace(expression.substring(leftBound), String.valueOf(subtractResult));
        }
        return expression.replace(expression.substring(leftBound, rightBound + 1), String.valueOf(subtractResult));
    }

}

import View, Operation, Logger



def button_click():
    
    View.hello()
    type_operation = View._input()
    value1 = View.getValue()
    value2 = View.getValue()

    if (type_operation == 1):
        print(Operation.sum_operation(value1, value2))
        Logger.write_log(Operation.sum_operation(value1, value2))

    elif (type_operation == 2):
        print(Operation.sub_operation(value1, value2))
        Logger.write_log(Operation.sub_operation(value1, value2))

    elif (type_operation == 3):
        print(Operation.mult_operation(value1, value2))
        Logger.write_log(Operation.mult_operation(value1, value2))

    elif (type_operation == 4):
        print(Operation.div_operation(value1, value2))
        Logger.write_log(Operation.div_operation(value1, value2))
    else:
        print("Введен неправильный вид операции!")

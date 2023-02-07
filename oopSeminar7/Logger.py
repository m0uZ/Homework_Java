from datetime import datetime


def write_log(data):
    time = datetime.now().strftime('%H часов %M минут %m.%d.%Y года')
    with open('oopSeminar7/log.csv', 'a', encoding='utf-8') as file:
        file.write('{};{}\n'.format(time, data))
#ATENÇÃO! NÃO EXECUTAR ESTE PROGRAMA EM SUA MÁQUINA. Este repositório é apenas um local para eu salvar meus arquivos, e este código definitivamente não funcionará em outro computador.

#Executar este código sem se atentar pode ser perigoso e pode levar a sua máquina a executar muitas ações indesejadas em seu computador.

import pyautogui
import time


pyautogui.click(x=14, y=765)
time.sleep(1)
pyautogui.click(x=20, y=564)
time.sleep(1)
pyautogui.press("F11")
pyautogui.click(x=1029, y=20)
pyautogui.write("D:/")
time.sleep(1)
pyautogui.press("enter")
time.sleep(1)
pyautogui.click(x=368, y=75)
time.sleep(2)
pyautogui.hotkey("ctrl", "c")
time.sleep(1)
pyautogui.click(x=369, y=221)
pyautogui.click(x=369, y=221)  
time.sleep(1)
pyautogui.click(x=343, y=73)
time.sleep(1)
pyautogui.hotkey("ctrl", "v")
time.sleep(2)
pyautogui.press("enter")
time.sleep(5)
pyautogui.click (x=976, y=105)
time.sleep(1)
pyautogui.click (x=976, y=105, button = "right")
pyautogui.click (x=1056, y=334)
time.sleep(2)
#ENTRANDO NO TERMINAL
pyautogui.write("git add .")
pyautogui.press("enter")
time.sleep(4)
pyautogui.write("git commit -m \"atualizacao das aulas\" ")
pyautogui.press("enter")
time.sleep(4)
pyautogui.write("git push ")
pyautogui.press("enter")

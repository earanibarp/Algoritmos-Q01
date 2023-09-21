Algoritmo Ejercicio1
	Definir c, f, k Como Real
	Definir opc Como Entero
	Escribir "Ingresa la temperatura en °C: "
	Leer c
	Escribir "Ingresa el número del tipo de conversión deseada: "
	Escribir "1. Kelvin"
	Escribir "2. Fahrenheit"
	Leer opc
	Si opc == 1 Entonces
		k = c + 273.15
		Escribir "La temperatura en °K es: ", k
	SiNo
		Si opc == 2 Entonces
			f = (9 * c) / 5 + 32 
			Escribir "La temperatura en °F es: ", f
		SiNo
			Escribir "Opción incorrecta"
		FinSi
	FinSi
FinAlgoritmo

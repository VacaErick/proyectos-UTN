#include <ESP32Servo.h>

const int pinPotenciometro = 34;
const int pinServo = 13;
const int led1 = 2;    
const int led2 = 4;      
const int led3 = 5;    

Servo miServo;

void setup() {
  Serial.begin(115200);
  miServo.attach(pinServo);
  
  // Configurar pines de LEDs como salidas
  pinMode(led1, OUTPUT);
  pinMode(led2, OUTPUT);
  pinMode(led3, OUTPUT);
  
  // Asegurar que todos los LEDs empiecen apagados
  digitalWrite(led1, LOW);
  digitalWrite(led2, LOW);
  digitalWrite(led3, LOW);
  
  Serial.println("Control Servo con Potenciometro - ESP32");
  Serial.println("Conexiones:");
  Serial.println("   Potenciometro: 3.3V, GPIO34, GND");
  Serial.println("   Servo: 3.3V, GPIO13, GND");
  Serial.println("   LED1 (0-60): GPIO2");
  Serial.println("   LED2 (61-120): GPIO4");
  Serial.println("   LED3 (121-180): GPIO5");
}

void loop() {
  int valorPot = analogRead(pinPotenciometro);
  int angulo = map(valorPot, 0, 4095, 0, 180);
  
  // Mover servo
  miServo.write(angulo);
  
  // Apagar todos los LEDs primero
  digitalWrite(led1, LOW);
  digitalWrite(led2, LOW);
  digitalWrite(led3, LOW);
  
  // Encender solo el LED correspondiente al rango
  if (angulo >= 0 && angulo <= 60) {
    digitalWrite(led1, HIGH);   // Encender LED1 (GPIO2) para 0-60
  } 
  else if (angulo >= 61 && angulo <= 120) {
    digitalWrite(led2, HIGH);   // Encender LED2 (GPIO4) para 61-120
  } 
  else if (angulo >= 121 && angulo <= 180) {
    digitalWrite(led3, HIGH);   // Encender LED3 (GPIO5) para 121-180
  }
  
  // Mostrar información
  Serial.print("Pot: ");
  Serial.print(valorPot);
  Serial.print(" | Angulo: ");
  Serial.print(angulo);
  Serial.print(" grados | LED: ");
  
  if (angulo <= 60) {
    Serial.println("1 (GPIO2) - Rango: 0-60");
  } else if (angulo <= 120) {
    Serial.println("2 (GPIO4) - Rango: 61-120");
  } else {
    Serial.println("3 (GPIO5) - Rango: 121-180");
  }
  
  delay(50);
}
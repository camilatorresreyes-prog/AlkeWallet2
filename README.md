AlkeWallet

Aplicación Android desarrollada como proyecto académico para el Módulo 5 del Bootcamp de Desarrollo Android.

La aplicación simula una billetera virtual que permite al usuario iniciar sesión y gestionar su saldo mediante operaciones básicas de depósito y retiro.

🎯 Objetivo del proyecto

Aplicar el patrón de arquitectura MVVM (Model – View – ViewModel) en una aplicación Android funcional, utilizando buenas prácticas de organización del código y separación de responsabilidades.

🧠 Arquitectura implementada

El proyecto fue desarrollado utilizando:

1        Patrón MVVM
2        Separación por capas inspirada en Clean Architecture
3        Repository Pattern
4        Use Cases
5        Gestión de estado con LiveData
6        Persistencia simple con SharedPreferences

🏗️ Estructura del proyecto

El proyecto se organiza de la siguiente manera:

📦 data
WalletRepository

📦 domain.usecase
-  DepositarUseCase
-  RetirarUseCase
-  GetSaldoUseCase

📦 model
-  Wallet

📦 viewmodel
-  WalletViewModel

📦 ui
-  MainActivity (Login)
-  WalletActivity

<img width="2457" height="1226" alt="mermaid-diagram" src="https://github.com/user-attachments/assets/0ae8dea1-a843-4193-8ef6-98a9009d8b27" />

<La aplicación inicia en `MainActivity`, donde el usuario realiza el inicio de sesión.  
Luego accede a `WalletActivity`, que corresponde a la vista principal de la billetera.

La lógica de negocio se maneja en `WalletViewModel`, que se comunica con los casos de uso:
- `GetSaldoUseCase`
- `DepositarUseCase`
- `RetirarUseCase`

Estos casos de uso interactúan con `WalletRepository`, que centraliza el acceso a los datos del modelo `Wallet`.

El `ViewModel` expone el estado mediante `LiveData`, permitiendo que la vista observe cambios en el saldo y en los mensajes mostrados al usuario.

Finalmente, se utiliza `SharedPreferences` para mantener el saldo guardado entre sesiones.>


⚙️ Funcionalidades implementadas

La aplicación permite:

*  Inicio de sesión simulado
*  Visualización del saldo
*  Depósito de dinero
*  Retiro de dinero
*  Persistencia del saldo entre sesiones
*  Observación de cambios mediante LiveData
*  Separación de lógica mediante UseCases y Repository

🔄 Flujo de la aplicación.

1  El usuario inicia sesión desde la pantalla principal.
2  Accede a la pantalla Wallet.
3  Puede visualizar su saldo actual.
4  Puede realizar depósitos o retiros.
5  El saldo queda almacenado para futuras ejecuciones.

💾 Persistencia de datos

Se utiliza:

SharedPreferences

Para almacenar el saldo del usuario de forma local y mantener el estado de la aplicación.

🎨 Interfaz de usuario

La interfaz mantiene coherencia visual con el proyecto del módulo anterior:

-  Pantalla de Login
-  Pantalla Wallet
-  Componentes visuales simples y funcionales

🛠️ Tecnologías utilizadas

-  Kotlin
-  Android Studio
-  MVVM
-  ViewModel
-  LiveData
-  SharedPreferences
-  Material Design básico

📚 Contexto académico

Este proyecto fue desarrollado con fines educativos como parte del proceso de aprendizaje en desarrollo de aplicaciones móviles Android.

🤖 Uso de herramientas de Inteligencia Artificial

Durante el desarrollo del proyecto se utilizaron herramientas de inteligencia artificial como apoyo para:

-  Comprensión de conceptos de arquitectura Android
-  Resolución de errores técnicos
-  Organización del código
-  Orientación conceptual

La implementación, desarrollo y comprensión del proyecto fueron realizados por la estudiante.

📖 Referencias bibliográficas

-  Material de clases Bootcamp Android — Módulo 5
-  Android Developers. ViewModel overview
-  Android Developers. LiveData overview
-  Android Developers. Guide to app architecture
-  Android Developers. SharedPreferences documentation

👩‍💻 Autora

Camila Torres Reyes

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/f50b3988-2589-484b-bb4e-2abca605a30c" />
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/9fda53ec-e165-426b-b59e-6622e6f07104" />
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/2af4217e-9918-4b4f-b0cb-b9057c6a57ba" />
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/b4d9a1b6-9822-4e1d-994e-476d8a0dd325" />


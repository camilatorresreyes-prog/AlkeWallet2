📱 AlkeWallet2

Aplicación móvil Android desarrollada como proyecto académico del Módulo 5, cuyo objetivo es simular el funcionamiento básico de una billetera digital.

Permite al usuario iniciar sesión y gestionar su saldo mediante operaciones simples de depósito y retiro de dinero.

  👩‍💻 Autora

Camila Torres Reyes

Proyecto desarrollado como parte del proceso de formación en desarrollo de aplicaciones móviles Android.

  🎯 Objetivo del proyecto

Aplicar el patrón de arquitectura MVVM (Model – View – ViewModel) en una aplicación Android funcional, incorporando buenas prácticas de organización del código y separación de responsabilidades.

  🧠 Arquitectura implementada

El proyecto utiliza el patrón:

MVVM (Model - View - ViewModel)

Esto permite:

*  Separar la lógica de negocio de la interfaz
*  Facilitar mantenimiento del código
*  Mejorar escalabilidad del proyecto

  🏗️ Estructura del proyecto

El proyecto se organiza en las siguientes capas:

📦 Model
-  Wallet.kt → Representa la billetera y su saldo
📦 ViewModel
-  WalletViewModel.kt → Maneja la lógica de negocio y estado de la aplicación
📦 View (UI)
-  MainActivity → Pantalla de inicio de sesión
-  WalletActivity → Pantalla principal de la billetera
📦 Domain (UseCases)
-  DepositarUseCase
-  RetirarUseCase
-  GetSaldoUseCase
📦 Data
-  WalletRepository → Manejo y persistencia de datos

  ⚙️ Funcionalidades implementadas

La aplicación permite:

*  Inicio de sesión simulado
*  Visualización del saldo
*  Depósito de dinero
*  Retiro de dinero
*  Persistencia del saldo mediante SharedPreferences
*  Registro simple de transacciones
*  Observación del estado mediante LiveData

  🔄 Flujo de la aplicación
1.  El usuario ingresa correo y contraseña.
2.  Accede a la pantalla Wallet.
3.  Puede visualizar su saldo actual.
4.  Puede realizar depósitos o retiros.
5.  El saldo queda almacenado para futuras sesiones.

  💾 Persistencia de datos

Se utiliza:

SharedPreferences

Para guardar el saldo del usuario de forma local y mantener el estado de la aplicación entre ejecuciones.

  📊 Diagrama de arquitectura

<img width="400" height="1120" alt="mermaid-diagram (1)" 
  src="https://github.com/user-attachments/assets/9fd304dd-84ae-4466-962c-790f7ed4763e" />

  🛠 Tecnologías utilizadas
*  Kotlin
*  Android Studio
*  Arquitectura MVVM
*  LiveData
*  ViewModel
*  SharedPreferences
*  XML Layouts

  📸 Capturas de la aplicación
-  Pantalla Login
-  Pantalla Wallet
-  Depósito
-  Retiro


📚 Referencias bibliográficas
*  Alkemy. Patrones de arquitectura en Android - Parte III. Material del módulo 5.
*  Alkemy. Patrones de arquitectura en Android - Parte IV. Material del módulo 5.
*  Android Developers. Guide to App Architecture. https://developer.android.com/topic/architecture
*  Android Developers. ViewModel. https://developer.android.com/topic/libraries/architecture/viewmodel
*  Android Developers. LiveData. https://developer.android.com/topic/libraries/architecture/livedata
*  Android Developers. SharedPreferences. https://developer.android.com/training/data-storage/shared-preferences
*  Kotlin Documentation. https://kotlinlang.org/docs/home.html


🤖 Uso de Inteligencia Artificial

Durante el desarrollo del proyecto se utilizaron herramientas de inteligencia artificial como apoyo para:

-  Comprensión de conceptos
-  Resolución de errores
-  Organización del código
-  Orientación sobre arquitectura MVVM

La implementación y comprensión del proyecto fue realizada por la autora.

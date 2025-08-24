package com.example.botonescuadrados;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btn_One;
    private Button btn_Two;
    private Button btn_Three;
    private Button btn_Four;
    private Button btn_Five;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        String msgOne = "Protege información sensible como clave de encriptación contraseñas certificadas y secreto\n" +
                "Evita que estos datos se almacenan en el código o en archivo de configuración expuestos\n" +
                "Reduce riesgos de filtraciones de credenciales y accesos autorizados";

        String msgTwo = "Centralización: todos los secretos están en un lugar seguro y administrado\n" +
                "Accesos controlados: permite definir política de acceso con azure activdirectory\n" +
                "Automatización: las aplicaciones acceden a los secretos de forma segura sin intervención manual\n" +
                "Cumplimiento: ayuda a cumplir normativas de seguridad y auditoria, (ISO, GDPR, etc)";

        String msgThree = "Azure key vault tiene un modelo de pago por uso:\n" +
                "Operación de gestión de claves (lectura, escritura, borrador) se borran con cada transacción\n" +
                "Almacenamiento y certificado y clave: depende del tipo (estándar, HSM – hardware segurity module\n" +
                " \n" +
                "Nivel de servicio:\n" +
                "Estándar: más económico, pesando para la mayoría de escenarios\n" +
                "Premium: usa HSMS Validado por FIPS";

        String msgResumen = "Azure key vault es un servicio de Microsoft que protege de forma segura los secretos, clave de cifrado y certificado.\n" +
                "Su principal objetivo es evitar que credenciales sensibles queden expuestas en el código o en el archivo.\n" +
                "Para las empresas, ofrece beneficios como mayor seguridad, control acceso, cumplimiento normativo y disponibilidad global.\n" +
                " El servicio se cobra bajo un modelo de pago por uso: cada operación de acceso o gestión tiene un costo, y existen niveles estándar o premium según el nivel de seguridad requerido.\n" +
                "En resumen, key vault es fundamental para proteger datos sensibles y garantizar la seguridad de las aplicaciones en la nube  ";

        btn_One = findViewById(R.id.btnOne);
        btn_One.setOnClickListener(v -> {
            AlertDialog dialog = new AlertDialog.Builder(this)
                    .setMessage(msgOne)
                    .setCancelable(false)
                    .create();

            dialog.show();

            new Handler().postDelayed(dialog::dismiss, 10000);
        });

        btn_Two = findViewById(R.id.btnTwo);
        btn_Two.setOnClickListener(v -> {
            AlertDialog dialog = new AlertDialog.Builder(this)
                    .setMessage(msgTwo)
                    .setCancelable(false)
                    .create();

            dialog.show();

            new Handler().postDelayed(dialog::dismiss, 10000);
        });
        btn_Three = findViewById(R.id.btnThree);
        btn_Three.setOnClickListener(v -> {
            AlertDialog dialog = new AlertDialog.Builder(this)
                    .setMessage(msgThree)
                    .setCancelable(false)
                    .create();

            dialog.show();

            new Handler().postDelayed(dialog::dismiss, 10000);
        });
        //mensaje de correo
        btn_Four = findViewById(R.id.btnFour);
        btn_Four.setOnClickListener(v -> {
            AlertDialog dialog = new AlertDialog.Builder(this)
                    .setMessage(msgResumen)
                    .setCancelable(false)
                    .create();

            dialog.show();

            new Handler().postDelayed(dialog::dismiss, 20000);
        });

        btn_Five = findViewById(R.id.btnFive);
        btn_Five.setOnClickListener(v -> Toast.makeText(this, "Five", Toast.LENGTH_SHORT).show());
    }
}
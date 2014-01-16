package com.example.criptoz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final String strToEncrypt = "011064";
		final String strPssword = "ilmondodicnacittadini";
		AES.setKey(strPssword);
		AES.encrypt(strToEncrypt.trim());
		System.out.println("String to Encrypt: " + strToEncrypt);
		System.out.println("Encrypted: " + AES.getEncryptedString());
		final String strToDecrypt = AES.getEncryptedString();
		AES.decrypt(strToDecrypt.trim());
		System.out.println("String To Decrypt : " + strToDecrypt);
		System.out.println("Decrypted : " + AES.getDecryptedString());
		TextView cripto = (TextView)findViewById(R.id.textView1);
		cripto.setText(AES.getEncryptedString());

		
	}
}

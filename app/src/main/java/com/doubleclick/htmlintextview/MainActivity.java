package com.doubleclick.htmlintextview;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static String begin = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "\n" +
            "<head>\n" +
            "    <style>\n" +
            "        table,\n" +
            "        th,\n" +
            "        td {\n" +
            "            border: 1px solid black;\n" +
            "          border-collapse: collapse;\n" +
            "      }\n" +
            "          table{\n" +
            "                        width: 100%; }\n" +
            "    </style>\n" +
            "  \n" +
            "</head>\n" +
            "\n" +
            "<body>";

    public static String end = "</body>\n" +
            "\n" +
            "</html>";

    public static String html = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "\n" +
            "<head>\n" +
            "  <style>\n" +
            "  \n" +
            "    table, th, td {\n" +
            "  border: 1px solid black;\n" +
            "  border-collapse: collapse;\n" +
            "      width : 100%\n" +
            "}\n" +
            "    \n" +
            "  </style>\n" +
            "</head>\n" +
            "\n" +
            "<body>\n" +
            "    <table style=\"width: 100%;\">\n" +
            "        <tbody>\n" +
            "            <tr>\n" +
            "                <td style=\"width: 20.0000%;\"><br></td>\n" +
            "                <td style=\"width: 20.0000%;\"><br></td>\n" +
            "                <td style=\"width: 20.0000%;\"><br></td>\n" +
            "                <td style=\"width: 20.0000%;\"><br></td>\n" +
            "                <td style=\"width: 20.0000%;\"><br></td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "                <td style=\"width: 20.0000%;\"><br></td>\n" +
            "                <td style=\"width: 20.0000%;\"><br></td>\n" +
            "                <td style=\"width: 20.0000%;\"><br></td>\n" +
            "                <td style=\"width: 20.0000%;\"><br></td>\n" +
            "                <td style=\"width: 20.0000%;\"><br></td>\n" +
            "            </tr>\n" +
            "        </tbody>\n" +
            "    </table>\n" +
            "</body>\n" +
            "\n" +
            "</html>";


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = findViewById(R.id.web);
        TextView textView = findViewById(R.id.text);
        webView.loadData(html, "text/html", "UTF-8");

        textView.setText(Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY));

    }
}
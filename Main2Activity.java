package zxy.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.btn)
    Button btn;
    @BindView(R.id.edit_text)
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        ButterKnife.bind( this );
        jumpActivity();
    }
    private void jumpActivity() {
        btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventBus.getDefault().post( new Loigbase( editText.getText().toString() ) );
                finish();
            }
        } );
    }
}

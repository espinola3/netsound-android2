package com.example.prova;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;


 
public class MainActivity extends ActionBarActivity {
    
	private String[] opcionesMenu;
    private DrawerLayout drawerLayout;
    private ListView drawerList;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
    	System.out.print("Comença");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        opcionesMenu = new String[] {"Mi perfil","Mis canciones", "Mis playlist","Amigos","Buscar"};
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerList = (ListView) findViewById(R.id.left_drawer);
        drawerList.setAdapter(new ArrayAdapter<String>(
                getSupportActionBar().getThemedContext(),
            android.R.layout.simple_list_item_1, opcionesMenu));
        
        drawerList.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view,
                    int position, long id) {
     
                Fragment fragment = null;
     
                switch (position+1) {
                    case 1:
                        fragment = new MyProfile();
                        break;
                    case 2:
                        fragment = new MySongs();
                        break;
                    case 3:
                        fragment = new MyPlaylists();
                        break;
                    case 4:
                        fragment = new Friends();
                        break;
                    case 5:
                        fragment = new Search();
                         break;
                }
     
                FragmentManager fragmentManager =
                    getSupportFragmentManager();
     
                fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, fragment)
                    .commit();
     
                drawerList.setItemChecked(position, true);
     
                String tituloSeccion = opcionesMenu[position];
                getSupportActionBar().setTitle(tituloSeccion);
     
                drawerLayout.closeDrawer(drawerList);
            }
        });
    }
}

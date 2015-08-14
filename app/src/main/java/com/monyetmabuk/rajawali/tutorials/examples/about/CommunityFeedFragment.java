package com.monyetmabuk.rajawali.tutorials.examples.about;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/*import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.koushikdutta.async.future.Future;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;*/
import com.monyetmabuk.rajawali.tutorials.examples.AExampleFragment;
import com.monyetmabuk.rajawali.tutorials.examples.about.CommunityFeedFragment.Activity.FeedItem;
import com.monyetmabuk.rajawali.tutorials.examples.about.dialogs.ExceptionDialog;
import com.monyetmabuk.rajawali.tutorials.views.GithubLogoView;

import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import ua.dp.budash.carrenderer.R;

public class CommunityFeedFragment extends AExampleFragment implements
		OnItemClickListener {

	@Override
	public AExampleRenderer createRenderer() {
		return null;
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		mLayout = (FrameLayout) inflater.inflate(R.layout.community_activity,
				null, false);

		return mLayout;
	}


	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		/*if (mQueryResponse != null)
			outState.putString(BUNDLE_QUERY_RESPONSE, mQueryResponse);*/
	}

	@Override
	public void onStop() {
		super.onStop();

		// Cancel any currently running ION tasks
		//Ion.getDefault(getActivity()).cancelAll();
	}

	@Override
	public void onItemClick(AdapterView<?> adapter, View view, int position,
			long id) {
/*		Intent intent = new Intent(Intent.ACTION_VIEW,
				Uri.parse(mCommunityAdapter.getItem(position).url));
		startActivity(intent);*/
	}


	public static final class Activity {

		public FeedItem[] items;

		public static final class FeedItem {
			public String title;
			public String published;
			public String url;
			public Actor actor;

			public static final class Actor {
				public String displayName;
				public Image image;

				public static final class Image {
					public String url;
				}
			}
		}
	}

}

/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.main.teatoday;

public final class R {
    public static final class array {
        public static final int tea_type_array=0x7f080000;
    }
    public static final class attr {
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int buttonBarButtonStyle=0x7f010001;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int buttonBarStyle=0x7f010000;
    }
    public static final class color {
        public static final int black_overlay=0x7f040000;
    }
    public static final class dimen {
        /**  Default screen margins, per the Android Design guidelines. 

         Customize dimensions originally defined in res/values/dimens.xml (such as
         screen margins) for sw720dp devices (e.g. 10" tablets) in landscape here.
    
         */
        public static final int activity_horizontal_margin=0x7f050000;
        public static final int activity_vertical_margin=0x7f050001;
    }
    public static final class drawable {
        public static final int ic_launcher=0x7f020000;
        public static final int logo=0x7f020001;
        public static final int story001=0x7f020002;
        public static final int story002=0x7f020003;
    }
    public static final class id {
        public static final int CheckBoxLinearLayout=0x7f0a0002;
        public static final int LinearLayout=0x7f0a0001;
        public static final int TeaInfoDetailsLayout=0x7f0a0010;
        public static final int TeaInfoLayout=0x7f0a000d;
        public static final int action_settings=0x7f0a0018;
        public static final int coldCheckBox=0x7f0a0007;
        public static final int findTeaButton=0x7f0a000c;
        public static final int fullscreen_content=0x7f0a0000;
        public static final int herbCheckBox=0x7f0a0009;
        public static final int herbText=0x7f0a0016;
        public static final int hotCheckBox=0x7f0a0006;
        public static final int hotOrColdText=0x7f0a0014;
        public static final int imageView1=0x7f0a000b;
        public static final int imageView2=0x7f0a000f;
        public static final int jellyCheckBox=0x7f0a0008;
        public static final int jellyText=0x7f0a0015;
        public static final int latteCheckBox=0x7f0a0005;
        public static final int latteText=0x7f0a0013;
        public static final int milkCheckBox=0x7f0a0004;
        public static final int milkText=0x7f0a0012;
        public static final int tapiocaPearlCheckBox=0x7f0a000a;
        public static final int tapiocaPearlText=0x7f0a0017;
        public static final int teaInfoText=0x7f0a000e;
        public static final int teaTypeCheckBox=0x7f0a0003;
        public static final int teaTypeText=0x7f0a0011;
    }
    public static final class layout {
        public static final int activity_intro_animation=0x7f030000;
        public static final int activity_main=0x7f030001;
    }
    public static final class menu {
        public static final int main=0x7f090000;
    }
    public static final class string {
        public static final int action_settings=0x7f060001;
        public static final int app_name=0x7f060000;
        public static final int cold=0x7f06000c;
        public static final int dummy_button=0x7f06000e;
        public static final int dummy_content=0x7f06000f;
        public static final int find_tea_button=0x7f060004;
        public static final int hello_world=0x7f060002;
        public static final int herb=0x7f06000a;
        public static final int hot=0x7f06000b;
        public static final int jelly=0x7f060008;
        public static final int latte=0x7f060007;
        public static final int milk=0x7f060006;
        public static final int tapioca_pearl=0x7f060009;
        public static final int tea_type=0x7f060003;
        public static final int tea_type_dialog_title=0x7f060005;
        public static final int title_activity_intro_animation=0x7f06000d;
    }
    public static final class style {
        /** 
        Base application theme, dependent on API level. This theme is replaced
        by AppBaseTheme from res/values-vXX/styles.xml on newer devices.

    

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.

        

        Base application theme for API 11+. This theme completely replaces
        AppBaseTheme from res/values/styles.xml on API 11+ devices.

    
 API 11 theme customizations can go here. 

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.
    
 API 14 theme customizations can go here. 
         */
        public static final int AppBaseTheme=0x7f070000;
        /**  Application theme. 
 All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static final int AppTheme=0x7f070001;
        public static final int ButtonBar=0x7f070003;
        public static final int ButtonBarButton=0x7f070004;
        public static final int FullscreenActionBarStyle=0x7f070005;
        public static final int FullscreenTheme=0x7f070002;
    }
    public static final class styleable {
        /** 
         Declare custom theme attributes that allow changing which styles are
         used for button bars depending on the API level.
         ?android:attr/buttonBarStyle is new as of API 11 so this is
         necessary to support previous API levels.
    
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #ButtonBarContainerTheme_buttonBarButtonStyle com.main.teatoday:buttonBarButtonStyle}</code></td><td></td></tr>
           <tr><td><code>{@link #ButtonBarContainerTheme_buttonBarStyle com.main.teatoday:buttonBarStyle}</code></td><td></td></tr>
           </table>
           @see #ButtonBarContainerTheme_buttonBarButtonStyle
           @see #ButtonBarContainerTheme_buttonBarStyle
         */
        public static final int[] ButtonBarContainerTheme = {
            0x7f010000, 0x7f010001
        };
        /**
          <p>This symbol is the offset where the {@link com.main.teatoday.R.attr#buttonBarButtonStyle}
          attribute's value can be found in the {@link #ButtonBarContainerTheme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name com.main.teatoday:buttonBarButtonStyle
        */
        public static final int ButtonBarContainerTheme_buttonBarButtonStyle = 1;
        /**
          <p>This symbol is the offset where the {@link com.main.teatoday.R.attr#buttonBarStyle}
          attribute's value can be found in the {@link #ButtonBarContainerTheme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name com.main.teatoday:buttonBarStyle
        */
        public static final int ButtonBarContainerTheme_buttonBarStyle = 0;
    };
}

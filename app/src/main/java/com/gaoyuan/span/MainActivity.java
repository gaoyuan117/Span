package com.gaoyuan.span;

import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.LayerRasterizer;
import android.graphics.Rasterizer;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.BulletSpan;
import android.text.style.ClickableSpan;
import android.text.style.DynamicDrawableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.QuoteSpan;
import android.text.style.RasterizerSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bulletSpan();
        quoteSpan();
        alignmentSpan();
        underlineSpan();
        strikethroughSpan();
        subscriptSpan();
        superscriptSpan();
        backgrounColorSpan();
        foregroundColorSpan();
        imageSpan();
        styleSpan();
        typefaceSpan();
        absoluteSizeSpan();
        relativeSizeSpan();
        scaleXSpan();
        maskFilterSpan();
        URLSpan();
        clickableSpan();
        textAppearanceSpan();
        dynamicDrawableSpan();
    }

    /**
     * 影响段落层次文字的格式，它让你在段落开头添加一个黑圆点。
     * 16是原点距离文字的距离
     */
    private void bulletSpan() {
        TextView bulletSpanTv = (TextView) findViewById(R.id.bullet_span);
        BulletSpan bulletSpan = new BulletSpan(16, Color.RED);
        SpannableString spannableString = new SpannableString("BulletSpan");
        spannableString.setSpan(bulletSpan, 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        bulletSpanTv.setText(spannableString);
    }

    /**
     * 影响段落层次文字的格式，它可以在段落前边添加一个竖直的引用线。
     */
    private void quoteSpan() {
        TextView quoteSpanTv = (TextView) findViewById(R.id.quote_span);
        QuoteSpan quoteSpan = new QuoteSpan(Color.RED);
        SpannableString spannableString = new SpannableString("QuoteSpan");
        spannableString.setSpan(quoteSpan, 0, 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        quoteSpanTv.setText(spannableString);
    }

    /**
     * 影响段落层次文字的格式，它允许你控制段落的对齐方式，有居中对齐，右侧对齐和左侧对齐。
     */
    private void alignmentSpan() {
        TextView alignmentSpanTv = (TextView) findViewById(R.id.alignment_span);
        AlignmentSpan.Standard alignmentSpan = new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL);
        SpannableString spannableString = new SpannableString("AlignmentSpan AlignmentSpan AlignmentSpan AlignmentSpan AlignmentSpan AlignmentSpan AlignmentSpan");
        spannableString.setSpan(alignmentSpan, 0, 1, Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        alignmentSpanTv.setText(spannableString);
    }

    /**
     * 影响字符层次文字的格式，它可以在文字下方添加下划线。其内部实现其实就是使用Paint.setUnderlineText(true)实现的。
     */
    private void underlineSpan() {
        TextView underlineSpanTv = (TextView) findViewById(R.id.underline_span);
        UnderlineSpan underlineSpan = new UnderlineSpan();
        SpannableString spannableString = new SpannableString("UnderlineSpan");
        spannableString.setSpan(underlineSpan, 0, spannableString.length(), Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        underlineSpanTv.setText(spannableString);
    }

    /**
     * 影响字符层次上的文字的格式，它允许你在文字上添加删除线。它内部使用Paint.setStrikeThruText(true))来实现。
     */
    private void strikethroughSpan() {
        TextView strikethroughSpanTv = (TextView) findViewById(R.id.strike_through_Span);
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        SpannableString spannableString = new SpannableString("StrikethroughSpan");
        spannableString.setSpan(strikethroughSpan, 0, spannableString.length(), Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        strikethroughSpanTv.setText(spannableString);
    }

    /**
     * 影响字符层次上的文字的格式，它允许你把文字作为下标进行显示。
     */
    private void subscriptSpan() {
        TextView subscriptSpanTv = (TextView) findViewById(R.id.subscript_span);
        SubscriptSpan span = new SubscriptSpan();
        SpannableString spannableString = new SpannableString("SubscriptSpan");
        spannableString.setSpan(span, 0, spannableString.length() / 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        subscriptSpanTv.setText(spannableString);
    }

    /**
     * 影响字符层次上的文字的格式，它允许你把文字作为上标进行显示。
     */
    private void superscriptSpan() {
        TextView superscriptSpanTv = (TextView) findViewById(R.id.superscript_span);
        SuperscriptSpan span = new SuperscriptSpan();
        SpannableString spannableString = new SpannableString("SuperscriptSpan");
        spannableString.setSpan(span, 0, spannableString.length() / 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        superscriptSpanTv.setText(spannableString);
    }

    /**
     * 影响字符层次上的文字的格式，你可以使用它设置文字的背景颜色。
     */
    private void backgrounColorSpan() {
        TextView backgroundColorSpanTv = (TextView) findViewById(R.id.background_color_Span);
        BackgroundColorSpan span = new BackgroundColorSpan(Color.RED);
        SpannableString spannableString = new SpannableString("BackgroundColorSpan");
        spannableString.setSpan(span, 0, spannableString.length() / 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        backgroundColorSpanTv.setText(spannableString);
    }

    /**
     * 影响字符层次上的文字的格式，你可以使用它设置文字的自己的颜色。
     */
    private void foregroundColorSpan() {
        TextView foregroundColorSpanTv = (TextView) findViewById(R.id.foreground_color_span);
        ForegroundColorSpan span = new ForegroundColorSpan(Color.RED);
        SpannableString spannableString = new SpannableString("ForegroundColorSpan");
        spannableString.setSpan(span, 0, spannableString.length() / 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        foregroundColorSpanTv.setText(spannableString);
    }

    /**
     * 影响字符层次上的文字的格式，你可以使用它在文字中间添加图片。
     */
    private void imageSpan() {
        TextView imageSpanTv = (TextView) findViewById(R.id.image_span);
        ImageSpan span = new ImageSpan(this, R.mipmap.ic_launcher);
        SpannableString spannableString = new SpannableString("ImageSpan");
        spannableString.setSpan(span, 2, 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        imageSpanTv.setText(spannableString);

    }

    /**
     * 影响字符层次上的文字的格式。它允许你设置文字的类型(bold, italic, normal)
     */
    private void styleSpan() {
        TextView styleSpanTv = (TextView) findViewById(R.id.style_span);
        StyleSpan span = new StyleSpan(Typeface.BOLD);
        SpannableString spannableString = new SpannableString("StyleSpan");
        spannableString.setSpan(span, 0, spannableString.length() / 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        styleSpanTv.setText(spannableString);
    }

    /**
     * 影响字符层次上的文字的格式。它允许你设置文字的字体族(monospace, serif等)
     */
    private void typefaceSpan() {
        TextView typefaceSpanTv = (TextView) findViewById(R.id.typeface_span);
        TypefaceSpan span = new TypefaceSpan("serif");
        SpannableString spannableString = new SpannableString("TypefaceSpan");
        spannableString.setSpan(span, 0, spannableString.length() / 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        typefaceSpanTv.setText(spannableString);
    }

    /**
     * 影响字符层次上的文字的格式。它允许你设置文字的绝对字体大小。
     */
    private void absoluteSizeSpan() {
        TextView absoluteSizeSpanTv = (TextView) findViewById(R.id.absolute_size_span);
        AbsoluteSizeSpan span = new AbsoluteSizeSpan(24, true);
        SpannableString spannableString = new SpannableString("AbsoluteSizeSpan");
        spannableString.setSpan(span, 0, spannableString.length() / 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        absoluteSizeSpanTv.setText(spannableString);
    }

    /**
     * 影响字符层次上的文字的格式。它允许你设置文字的相对字体大小。
     */
    private void relativeSizeSpan() {
        TextView relativeSizeSpanTv = (TextView) findViewById(R.id.relative_size_span);
        RelativeSizeSpan span = new RelativeSizeSpan(2.0f);
        SpannableString spannableString = new SpannableString("RelativeSizeSpan");
        spannableString.setSpan(span, 0, spannableString.length() / 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        relativeSizeSpanTv.setText(spannableString);
    }

    /**
     * 影响字符层次上的文字的格式。它让你让文字在ｘ方向上进行缩放。
     */
    private void scaleXSpan() {
        TextView scaleXSpanTv = (TextView) findViewById(R.id.scale_x_span);
        ScaleXSpan span = new ScaleXSpan(2.0f);
        SpannableString spannableString = new SpannableString("ScaleXSpanTv");
        spannableString.setSpan(span, 0, spannableString.length() / 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        scaleXSpanTv.setText(spannableString);

    }

    /**
     * 影响字符层次上的文字的格式。如模糊(BlurMaskFilter)、浮雕(EmbossMaskFilter)
     */
    private void maskFilterSpan() {
        TextView maskFilterSpanTv = (TextView) findViewById(R.id.mask_filter_span);
        MaskFilterSpan blurMaskFilterSpan = new MaskFilterSpan(new BlurMaskFilter(20, BlurMaskFilter.Blur.NORMAL));
        MaskFilterSpan embossMaskFilterSpan = new MaskFilterSpan(new EmbossMaskFilter(new float[]{1, 1, 1}, 0.4f, 6, 3.5f));
        SpannableString spannableString = new SpannableString("MaskFilterSpan");
        spannableString.setSpan(blurMaskFilterSpan, 0, 4, Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        maskFilterSpanTv.setText(spannableString);
    }

    /**
     * 设置文本超链接
     */
    private void URLSpan() {
        TextView urlSpanTv = (TextView) findViewById(R.id.url_span);
        SpannableString spannableString = new SpannableString("URLSpan");
        URLSpan urlSpan = new URLSpan("tel:0123456789");
        spannableString.setSpan(urlSpan, 0, spannableString.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        urlSpanTv.setText(spannableString);
    }

    /**
     * 设置文本的点击
     */
    private void clickableSpan() {
        TextView clickableSpanTv = (TextView) findViewById(R.id.clickable_span);
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Toast.makeText(MainActivity.this, "点击了URL", Toast.LENGTH_SHORT).show();
            }
        };
        SpannableStringBuilder builder = new SpannableStringBuilder();
        builder.append("Android TextView");
        builder.setSpan(clickableSpan, 0, 7, Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        clickableSpanTv.setText(builder);
        clickableSpanTv.setMovementMethod(LinkMovementMethod.getInstance());//务必加上这句不然没效果
    }

    /**
     * TextAppearanceSpan 文本外貌（包括字体、大小、样式和颜色）
     * 若需自定义TextAppearance，可以在系统样式上进行修改
     */
    private void textAppearanceSpan() {
        TextView textAppearanceSpanTv = (TextView) findViewById(R.id.text_appearance_span);
        SpannableString spannableString = new SpannableString("TextAppearanceSpan");
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(this, android.R.style.TextAppearance_Holo);
        spannableString.setSpan(textAppearanceSpan, 0, 3, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        textAppearanceSpanTv.setText(spannableString);
    }

    /**
     * 设置图片，基于文本基线或底部对齐。
     */
    private void dynamicDrawableSpan() {
        TextView dynamicDrawableSpanTv = (TextView) findViewById(R.id.dynamic_drawable_span);
        DynamicDrawableSpan drawableSpan = new DynamicDrawableSpan(DynamicDrawableSpan.ALIGN_BASELINE) {

            @Override
            public Drawable getDrawable() {
                Drawable d = getResources().getDrawable(R.mipmap.ic_launcher);
                d.setBounds(0, 0, 50, 50);
                return d;
            }
        };

        DynamicDrawableSpan drawableSpan2 = new DynamicDrawableSpan(DynamicDrawableSpan.ALIGN_BOTTOM) {

            @Override
            public Drawable getDrawable() {
                Drawable d = getResources().getDrawable(R.mipmap.ic_launcher);
                d.setBounds(0, 0, 50, 50);
                return d;
            }
        };
        SpannableString spannableString = new SpannableString("DynamicDrawableSpan");
        spannableString.setSpan(drawableSpan, 3, 4, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(drawableSpan2, 7, 8, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        dynamicDrawableSpanTv.setText(spannableString);
        // PS:左边图片基于基线对齐，右边图片基于底部对齐

    }
}

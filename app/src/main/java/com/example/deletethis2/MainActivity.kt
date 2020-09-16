package com.example.deletethis2

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.deletethis2.databinding.ActivityMainBinding
import jp.wasabeef.richeditor.RichEditor

class MainActivity : AppCompatActivity() {
    private var mEditor: RichEditor? = null
    private var mPreview: TextView? = null

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mEditor = binding.editor

        binding.editor.setEditorHeight(200)
        binding.editor.setEditorFontSize(22)
        binding.editor.setEditorFontColor(Color.BLACK)
        //mEditor.setEditorBackgroundColor(Color.BLUE);
        //mEditor.setBackgroundColor(Color.BLUE);
        //mEditor.setBackgroundResource(R.drawable.bg);
        binding.editor.setPadding(10, 10, 10, 10)
        //mEditor.setBackground("https://raw.githubusercontent.com/wasabeef/art/master/chip.jpg");
        binding.editor.setPlaceholder("Insert text here...")
        //mEditor.setInputEnabled(false);
//        mPreview = findViewById<View>(R.id.preview) as TextView
//        mEditor!!.setOnTextChangeListener { text -> mPreview!!.text = text }

        binding.actionUndo.setOnClickListener { mEditor!!.undo() }
        binding.actionRedo.setOnClickListener { mEditor!!.redo() }
        binding.actionBold.setOnClickListener { mEditor!!.setBold() }
        binding.actionItalic.setOnClickListener { mEditor!!.setItalic() }
//        bindingaction_subscript).setOnClickListener { mEditor!!.setSubscript() }
//        bindingaction_superscript).setOnClickListener { mEditor!!.setSuperscript() }
        binding.actionStrikethrough.setOnClickListener { mEditor!!.setStrikeThrough() }
        binding.actionUnderline.setOnClickListener { mEditor!!.setUnderline() }
//        bindingaction_heading1).setOnClickListener {
//            mEditor!!.setHeading(
//                1
//            )
//        }
//        bindingaction_heading2).setOnClickListener {
//            mEditor!!.setHeading(
//                2
//            )
//        }
//        bindingaction_heading3).setOnClickListener {
//            mEditor!!.setHeading(
//                3
//            )
//        }
//        bindingaction_heading4).setOnClickListener {
//            mEditor!!.setHeading(
//                4
//            )
//        }
//        bindingaction_heading5).setOnClickListener {
//            mEditor!!.setHeading(
//                5
//            )
//        }
//        bindingaction_heading6).setOnClickListener {
//            mEditor!!.setHeading(
//                6
//            )
//        }
//        bindingaction_txt_color).setOnClickListener(object : View.OnClickListener {
//            private var isChanged = false
//            override fun onClick(v: View) {
//                mEditor!!.setTextColor(if (isChanged) Color.BLACK else Color.RED)
//                isChanged = !isChanged
//            }
//        })
//        bindingaction_bg_color).setOnClickListener(object : View.OnClickListener {
//            private var isChanged = false
//            override fun onClick(v: View) {
//                mEditor!!.setTextBackgroundColor(if (isChanged) Color.TRANSPARENT else Color.YELLOW)
//                isChanged = !isChanged
//            }
//        })
//        bindingaction_indent).setOnClickListener { mEditor!!.setIndent() }
//        bindingaction_outdent).setOnClickListener { mEditor!!.setOutdent() }
        binding.actionAlignLeft.setOnClickListener { mEditor!!.setAlignLeft() }
        binding.actionAlignCenter.setOnClickListener { mEditor!!.setAlignCenter() }
        binding.actionAlignRight.setOnClickListener { mEditor!!.setAlignRight() }
//        bindingaction_blockquote).setOnClickListener { mEditor!!.setBlockquote() }
        binding.actionInsertBullets.setOnClickListener { mEditor!!.setBullets() }
        binding.actionInsertNumbers.setOnClickListener { mEditor!!.setNumbers() }
//        bindingaction_insert_image).setOnClickListener {
//            mEditor!!.insertImage(
//                "http://www.1honeywan.com/dachshund/image/7.21/7.21_3_thumb.JPG",
//                "dachshund"
//            )
//        }
//        bindingaction_insert_link).setOnClickListener {
//            mEditor!!.insertLink(
//                "https://github.com/wasabeef",
//                "wasabeef"
//            )
//        }
        binding.actionInsertCheckbox.setOnClickListener { mEditor!!.insertTodo() }
    }
}



//
//import android.graphics.Color
//import android.os.Bundle
//import android.text.SpannableStringBuilder
//import android.view.View
//import android.widget.TextView
//import android.widget.Toolbar
//import androidx.appcompat.app.AppCompatActivity
//import com.google.android.material.appbar.MaterialToolbar
////import com.chinalwb.are.AREditor
//import com.yahiaangelo.markdownedittext.MarkdownEditText
//import com.yahiaangelo.markdownedittext.MarkdownStylesBar
//
//
//class MainActivity : AppCompatActivity() {
//
////    private var arEditor: AREditor? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//
//        val markdownEditText = findViewById<MarkdownEditText>(R.id.edittext)
//        val stylesBar = findViewById<MarkdownStylesBar>(R.id.stylesbar)
//        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
//        markdownEditText.setStylesBar(stylesBar)
//
//        toolbar.setOnMenuItemClickListener {
//            when(it.itemId){
//                R.id.to_md -> markdownEditText.text = SpannableStringBuilder(markdownEditText.getMD())
//                R.id.render_md -> markdownEditText.renderMD()
//            }
//            return@setOnMenuItemClickListener true
//        }
//
////        arEditor = findViewById<View>(R.id.areditor) as AREditor
////
////        arEditor!!.setExpandMode(AREditor.ExpandMode.FULL)
////        arEditor!!.setHideToolbar(false)
////        arEditor!!.setToolbarAlignment(AREditor.ToolbarAlignment.BOTTOM)
//
//    }
//}




//package infix.studios.deletethis2
//
//import android.graphics.Color
//import android.os.Bundle
//import android.view.View
//import android.widget.TextView
//import androidx.appcompat.app.AppCompatActivity
//import com.chinalwb.are.AREditor
//import jp.wasabeef.richeditor.RichEditor
//
//
//class MainActivity : AppCompatActivity() {
//
//    private var mEditor: RichEditor? = null
////    private var mPreview: TextView? = null
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        mEditor = findViewById<View>(R.id.editor) as RichEditor
//
//        mEditor!!!!.setEditorHeight(200)
//        mEditor!!.setEditorFontSize(22)
//        mEditor!!.setEditorFontColor(Color.RED)
//        //mEditor!!.setEditorBackgroundColor(Color.BLUE);
//        //mEditor!!.setBackgroundColor(Color.BLUE);
//        //mEditor!!.setBackgroundResource(R.drawable.bg);
//        mEditor!!.setPadding(10, 10, 10, 10)
//        //mEditor!!.setBackground("https://raw.githubusercontent.com/wasabeef/art/master/chip.jpg");
//        mEditor!!.setPlaceholder("Insert text here...")
//        //mEditor!!.setInputEnabled(false);
////        mPreview = findViewById<View>(R.id.preview) as TextView
//        mEditor!!.setOnTextChangeListener(object : RichEditor.OnTextChangeListener {
//            override fun onTextChange(text: String?) {
////                mPreview!!.text = text
//            }
//        })
//        findViewById<View>(R.id.action_undo).setOnClickListener { mEditor!!.undo() }
//        findViewById<View>(R.id.action_redo).setOnClickListener { mEditor!!.redo() }
//        findViewById<View>(R.id.action_bold).setOnClickListener { mEditor!!.setBold() }
//        findViewById<View>(R.id.action_italic).setOnClickListener { mEditor!!.setItalic() }
//        findViewById<View>(R.id.action_subscript).setOnClickListener { mEditor!!.setSubscript() }
//        findViewById<View>(R.id.action_superscript).setOnClickListener { mEditor!!.setSuperscript() }
//        findViewById<View>(R.id.action_strikethrough).setOnClickListener { mEditor!!.setStrikeThrough() }
//        findViewById<View>(R.id.action_underline).setOnClickListener { mEditor!!.setUnderline() }
//        findViewById<View>(R.id.action_heading1).setOnClickListener {
//            mEditor!!.setHeading(
//                1
//            )
//        }
//        findViewById<View>(R.id.action_heading2).setOnClickListener {
//            mEditor!!.setHeading(
//                2
//            )
//        }
//        findViewById<View>(R.id.action_heading3).setOnClickListener {
//            mEditor!!.setHeading(
//                3
//            )
//        }
//        findViewById<View>(R.id.action_heading4).setOnClickListener {
//            mEditor!!.setHeading(
//                4
//            )
//        }
//        findViewById<View>(R.id.action_heading5).setOnClickListener {
//            mEditor!!.setHeading(
//                5
//            )
//        }
//        findViewById<View>(R.id.action_heading6).setOnClickListener {
//            mEditor!!.setHeading(
//                6
//            )
//        }
//        findViewById<View>(R.id.action_txt_color).setOnClickListener(object : View.OnClickListener {
//            private var isChanged = false
//            override fun onClick(v: View) {
//                mEditor!!.setTextColor(if (isChanged) Color.BLACK else Color.RED)
//                isChanged = !isChanged
//            }
//        })
//        findViewById<View>(R.id.action_bg_color).setOnClickListener(object : View.OnClickListener {
//            private var isChanged = false
//            override fun onClick(v: View) {
//                mEditor!!.setTextBackgroundColor(if (isChanged) Color.TRANSPARENT else Color.YELLOW)
//                isChanged = !isChanged
//            }
//        })
//        findViewById<View>(R.id.action_indent).setOnClickListener { mEditor!!.setIndent() }
//        findViewById<View>(R.id.action_outdent).setOnClickListener { mEditor!!.setOutdent() }
//        findViewById<View>(R.id.action_align_left).setOnClickListener { mEditor!!.setAlignLeft() }
//        findViewById<View>(R.id.action_align_center).setOnClickListener { mEditor!!.setAlignCenter() }
//        findViewById<View>(R.id.action_align_right).setOnClickListener { mEditor!!.setAlignRight() }
//        findViewById<View>(R.id.action_blockquote).setOnClickListener { mEditor!!.setBlockquote() }
//        findViewById<View>(R.id.action_insert_bullets).setOnClickListener { mEditor!!.setBullets() }
//        findViewById<View>(R.id.action_insert_numbers).setOnClickListener { mEditor!!.setNumbers() }
//        findViewById<View>(R.id.action_insert_image).setOnClickListener {
//            mEditor!!.insertImage(
//                "http://www.1honeywan.com/dachshund/image/7.21/7.21_3_thumb.JPG",
//                "dachshund"
//            )
//        }
//        findViewById<View>(R.id.action_insert_link).setOnClickListener {
//            mEditor!!.insertLink(
//                "https://github.com/wasabeef",
//                "wasabeef"
//            )
//        }
//        findViewById<View>(R.id.action_insert_checkbox).setOnClickListener { mEditor!!.insertTodo() }
//    }
//}
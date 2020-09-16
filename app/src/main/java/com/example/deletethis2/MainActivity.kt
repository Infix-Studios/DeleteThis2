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

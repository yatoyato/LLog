package enn.demo.and.llog

import android.app.*
import android.app.assist.AssistContent
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.Canvas
import android.net.Uri
import android.os.Bundle
import android.os.CancellationSignal
import android.os.PersistableBundle
import android.util.AttributeSet
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import enn.libs.and.llog.LLog
import java.util.function.Consumer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        LLog.v()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__main)
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        LLog.v()
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onApplyThemeResource(theme: Resources.Theme?, resid: Int, first: Boolean) {
        LLog.v()
        super.onApplyThemeResource(theme, resid, first)
    }

    override fun onCreatePanelView(featureId: Int): View? {
        LLog.v()
        return super.onCreatePanelView(featureId)
    }

    override fun onWindowAttributesChanged(params: WindowManager.LayoutParams?) {
        LLog.v()
        super.onWindowAttributesChanged(params)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        LLog.v()
        super.onWindowFocusChanged(hasFocus)
    }

    override fun onAttachedToWindow() {
        LLog.v()
        super.onAttachedToWindow()
    }

    override fun onDetachedFromWindow() {
        LLog.v()
        super.onDetachedFromWindow()
    }

    override fun onSearchRequested(searchEvent: SearchEvent?): Boolean {
        LLog.v()
        return super.onSearchRequested(searchEvent)
    }

    override fun onSearchRequested(): Boolean {
        LLog.v()
        return super.onSearchRequested()
    }

    override fun onWindowStartingActionMode(callback: ActionMode.Callback?): ActionMode? {
        LLog.v()
        return super.onWindowStartingActionMode(callback)
    }

    override fun onWindowStartingActionMode(
        callback: ActionMode.Callback?,
        type: Int
    ): ActionMode? {
        LLog.v()
        return super.onWindowStartingActionMode(callback, type)
    }

    override fun onActionModeStarted(mode: ActionMode?) {
        LLog.v()
        super.onActionModeStarted(mode)
    }

    override fun onActionModeFinished(mode: ActionMode?) {
        LLog.v()
        super.onActionModeFinished(mode)
    }

    override fun onProvideKeyboardShortcuts(
        data: MutableList<KeyboardShortcutGroup>?,
        menu: Menu?,
        deviceId: Int
    ) {
        LLog.v()
        super.onProvideKeyboardShortcuts(data, menu, deviceId)
    }

    override fun onKeyLongPress(keyCode: Int, event: KeyEvent?): Boolean {
        LLog.v()
        return super.onKeyLongPress(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        LLog.v()
        return super.onKeyUp(keyCode, event)
    }

    override fun onKeyMultiple(keyCode: Int, repeatCount: Int, event: KeyEvent?): Boolean {
        LLog.v()
        return super.onKeyMultiple(keyCode, repeatCount, event)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        LLog.v()
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onTrimMemory(level: Int) {
        LLog.v()
        super.onTrimMemory(level)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        LLog.v()
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        LLog.v()
        super.onRestoreInstanceState(savedInstanceState, persistentState)
    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        LLog.v()
        super.onPostCreate(savedInstanceState, persistentState)
    }

    override fun onRestart() {
        LLog.v()
        super.onRestart()
    }

    override fun onTopResumedActivityChanged(isTopResumedActivity: Boolean) {
        LLog.v()
        super.onTopResumedActivityChanged(isTopResumedActivity)
    }

    override fun onLocalVoiceInteractionStarted() {
        LLog.v()
        super.onLocalVoiceInteractionStarted()
    }

    override fun onLocalVoiceInteractionStopped() {
        LLog.v()
        super.onLocalVoiceInteractionStopped()
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        LLog.v()
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onUserLeaveHint() {
        LLog.v()
        super.onUserLeaveHint()
    }

    override fun onCreateThumbnail(outBitmap: Bitmap?, canvas: Canvas?): Boolean {
        LLog.v()
        return super.onCreateThumbnail(outBitmap, canvas)
    }

    override fun onCreateDescription(): CharSequence? {
        LLog.v()
        return super.onCreateDescription()
    }

    override fun onProvideAssistData(data: Bundle?) {
        LLog.v()
        super.onProvideAssistData(data)
    }

    override fun onProvideAssistContent(outContent: AssistContent?) {
        LLog.v()
        super.onProvideAssistContent(outContent)
    }

    override fun onGetDirectActions(
        cancellationSignal: CancellationSignal,
        callback: Consumer<MutableList<DirectAction>>
    ) {
        LLog.v()
        super.onGetDirectActions(cancellationSignal, callback)
    }

    override fun onPerformDirectAction(
        actionId: String,
        arguments: Bundle,
        cancellationSignal: CancellationSignal,
        resultListener: Consumer<Bundle>
    ) {
        LLog.v()
        super.onPerformDirectAction(actionId, arguments, cancellationSignal, resultListener)
    }

    override fun onMultiWindowModeChanged(isInMultiWindowMode: Boolean, newConfig: Configuration?) {
        LLog.v()
        super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig)
    }

    override fun onPictureInPictureModeChanged(
        isInPictureInPictureMode: Boolean,
        newConfig: Configuration?
    ) {
        LLog.v()
        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig)
    }

    override fun onPictureInPictureRequested(): Boolean {
        LLog.v()
        return super.onPictureInPictureRequested()
    }

    override fun onAttachFragment(fragment: Fragment?) {
        LLog.v()
        super.onAttachFragment(fragment)
    }

    override fun onKeyShortcut(keyCode: Int, event: KeyEvent?): Boolean {
        LLog.v()
        return super.onKeyShortcut(keyCode, event)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        LLog.v()
        return super.onTouchEvent(event)
    }

    override fun onTrackballEvent(event: MotionEvent?): Boolean {
        LLog.v()
        return super.onTrackballEvent(event)
    }

    override fun onGenericMotionEvent(event: MotionEvent?): Boolean {
        LLog.v()
        return super.onGenericMotionEvent(event)
    }

    override fun onUserInteraction() {
        LLog.v()
        super.onUserInteraction()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        LLog.v()
        return super.onCreateOptionsMenu(menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        LLog.v()
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        LLog.v()
        return super.onOptionsItemSelected(item)
    }

    override fun onNavigateUp(): Boolean {
        LLog.v()
        return super.onNavigateUp()
    }

    override fun onNavigateUpFromChild(child: Activity?): Boolean {
        LLog.v()
        return super.onNavigateUpFromChild(child)
    }

    override fun onCreateNavigateUpTaskStack(builder: TaskStackBuilder?) {
        LLog.v()
        super.onCreateNavigateUpTaskStack(builder)
    }

    override fun onPrepareNavigateUpTaskStack(builder: TaskStackBuilder?) {
        LLog.v()
        super.onPrepareNavigateUpTaskStack(builder)
    }

    override fun onOptionsMenuClosed(menu: Menu?) {
        LLog.v()
        super.onOptionsMenuClosed(menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        LLog.v()
        return super.onContextItemSelected(item)
    }

    override fun onContextMenuClosed(menu: Menu) {
        LLog.v()
        super.onContextMenuClosed(menu)
    }

    override fun onCreateDialog(id: Int): Dialog {
        LLog.v()
        return super.onCreateDialog(id)
    }

    override fun onCreateDialog(id: Int, args: Bundle?): Dialog? {
        LLog.v()
        return super.onCreateDialog(id, args)
    }

    override fun onPrepareDialog(id: Int, dialog: Dialog?) {
        LLog.v()
        super.onPrepareDialog(id, dialog)
    }

    override fun onPrepareDialog(id: Int, dialog: Dialog?, args: Bundle?) {
        LLog.v()
        super.onPrepareDialog(id, dialog, args)
    }

    override fun onProvideReferrer(): Uri {
        LLog.v()
        return super.onProvideReferrer()
    }

    override fun onActivityReenter(resultCode: Int, data: Intent?) {
        LLog.v()
        super.onActivityReenter(resultCode, data)
    }

    override fun onChildTitleChanged(childActivity: Activity?, title: CharSequence?) {
        LLog.v()
        super.onChildTitleChanged(childActivity, title)
    }

    override fun onVisibleBehindCanceled() {
        LLog.v()
        super.onVisibleBehindCanceled()
    }

    override fun onEnterAnimationComplete() {
        LLog.v()
        super.onEnterAnimationComplete()
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        LLog.v()
        super.onPostCreate(savedInstanceState)
    }

    override fun onMenuOpened(featureId: Int, menu: Menu): Boolean {
        LLog.v()
        return super.onMenuOpened(featureId, menu)
    }

    override fun onContentChanged() {
        LLog.v()
        super.onContentChanged()
    }

    override fun onPanelClosed(featureId: Int, menu: Menu) {
        LLog.v()
        super.onPanelClosed(featureId, menu)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        LLog.v()
        return super.onKeyDown(keyCode, event)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        LLog.v()
        super.onConfigurationChanged(newConfig)
    }

    override fun onStart() {
        LLog.v()
        super.onStart()
    }

    override fun onPostResume() {
        LLog.v()
        super.onPostResume()
    }

    override fun onStop() {
        LLog.v()
        super.onStop()
    }

    override fun onDestroy() {
        LLog.v()
        super.onDestroy()
    }

    override fun onTitleChanged(title: CharSequence?, color: Int) {
        LLog.v()
        super.onTitleChanged(title, color)
    }

    override fun onSupportActionModeStarted(mode: androidx.appcompat.view.ActionMode) {
        LLog.v()
        super.onSupportActionModeStarted(mode)
    }

    override fun onSupportActionModeFinished(mode: androidx.appcompat.view.ActionMode) {
        LLog.v()
        super.onSupportActionModeFinished(mode)
    }

    override fun onWindowStartingSupportActionMode(callback: androidx.appcompat.view.ActionMode.Callback): androidx.appcompat.view.ActionMode? {
        LLog.v()
        return super.onWindowStartingSupportActionMode(callback)
    }

    override fun onCreateSupportNavigateUpTaskStack(builder: androidx.core.app.TaskStackBuilder) {
        LLog.v()
        super.onCreateSupportNavigateUpTaskStack(builder)
    }

    override fun onPrepareSupportNavigateUpTaskStack(builder: androidx.core.app.TaskStackBuilder) {
        LLog.v()
        super.onPrepareSupportNavigateUpTaskStack(builder)
    }

    override fun onSupportNavigateUp(): Boolean {
        LLog.v()
        return super.onSupportNavigateUp()
    }

    override fun onSupportContentChanged() {
        LLog.v()
        super.onSupportContentChanged()
    }

    override fun onNightModeChanged(mode: Int) {
        LLog.v()
        super.onNightModeChanged(mode)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        LLog.v()
        super.onSaveInstanceState(outState)
    }

    override fun onBackPressed() {
        LLog.v()
        super.onBackPressed()
    }

    override fun onRetainCustomNonConfigurationInstance(): Any? {
        LLog.v()
        return super.onRetainCustomNonConfigurationInstance()
    }

    override fun onMultiWindowModeChanged(isInMultiWindowMode: Boolean) {
        LLog.v()
        super.onMultiWindowModeChanged(isInMultiWindowMode)
    }

    override fun onPictureInPictureModeChanged(isInPictureInPictureMode: Boolean) {
        LLog.v()
        super.onPictureInPictureModeChanged(isInPictureInPictureMode)
    }

    override fun onAttachFragment(fragment: androidx.fragment.app.Fragment) {
        LLog.v()
        super.onAttachFragment(fragment)
    }

    override fun onCreateView(
        parent: View?,
        name: String,
        context: Context,
        attrs: AttributeSet
    ): View? {
        LLog.v()
        return super.onCreateView(parent, name, context, attrs)
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        LLog.v()
        return super.onCreateView(name, context, attrs)
    }

    override fun onCreatePanelMenu(featureId: Int, menu: Menu): Boolean {
        LLog.v()
        return super.onCreatePanelMenu(featureId, menu)
    }

    override fun onPreparePanel(featureId: Int, view: View?, menu: Menu): Boolean {
        LLog.v()
        return super.onPreparePanel(featureId, view, menu)
    }

    override fun onLowMemory() {
        LLog.v()
        super.onLowMemory()
    }

    override fun onStateNotSaved() {
        LLog.v()
        super.onStateNotSaved()
    }

    override fun onResume() {
        LLog.v()
        super.onResume()
    }

    override fun onNewIntent(intent: Intent?) {
        LLog.v()
        super.onNewIntent(intent)
    }

    override fun onPause() {
        LLog.v()
        super.onPause()
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        LLog.v()
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        LLog.v()
        super.onActivityResult(requestCode, resultCode, data)
    }

    override fun onResumeFragments() {
        LLog.v()
        super.onResumeFragments()
    }

    override fun onPrepareOptionsPanel(view: View?, menu: Menu): Boolean {
        LLog.v()
        return super.onPrepareOptionsPanel(view, menu)
    }
}
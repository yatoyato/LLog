package enn.demo.and.llog

import android.animation.Animator
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.AttributeSet
import android.view.*
import android.view.animation.Animation
import androidx.fragment.app.Fragment
import enn.libs.and.llog.LLog

class MainFragment : Fragment() {

    override fun onConfigurationChanged(newConfig: Configuration) {
        LLog.v()
        super.onConfigurationChanged(newConfig)
    }

    override fun onLowMemory() {
        LLog.v()
        super.onLowMemory()
    }

    override fun onCreateContextMenu(
        menu: ContextMenu,
        v: View,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        LLog.v()
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onHiddenChanged(hidden: Boolean) {
        LLog.v()
        super.onHiddenChanged(hidden)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        LLog.v()
        super.onActivityResult(requestCode, resultCode, data)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        LLog.v()
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    override fun onGetLayoutInflater(savedInstanceState: Bundle?): LayoutInflater {
        LLog.v()
        return super.onGetLayoutInflater(savedInstanceState)
    }

    override fun onInflate(context: Context, attrs: AttributeSet, savedInstanceState: Bundle?) {
        LLog.v()
        super.onInflate(context, attrs, savedInstanceState)
    }

    override fun onInflate(activity: Activity, attrs: AttributeSet, savedInstanceState: Bundle?) {
        LLog.v()
        super.onInflate(activity, attrs, savedInstanceState)
    }

    override fun onAttachFragment(childFragment: Fragment) {
        LLog.v()
        super.onAttachFragment(childFragment)
    }

    override fun onAttach(context: Context) {
        LLog.v()
        super.onAttach(context)
    }

    override fun onAttach(activity: Activity) {
        LLog.v()
        super.onAttach(activity)
    }

    override fun onCreateAnimation(transit: Int, enter: Boolean, nextAnim: Int): Animation? {
        LLog.v()
        return super.onCreateAnimation(transit, enter, nextAnim)
    }

    override fun onCreateAnimator(transit: Int, enter: Boolean, nextAnim: Int): Animator? {
        LLog.v()
        return super.onCreateAnimator(transit, enter, nextAnim)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        LLog.v()
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        LLog.v()
        val view = inflater.inflate(R.layout.fragment__main, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        LLog.v()
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        LLog.v()
        super.onActivityCreated(savedInstanceState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        LLog.v()
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onStart() {
        LLog.v()
        super.onStart()
    }

    override fun onResume() {
        LLog.v()
        super.onResume()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        LLog.v()
        super.onSaveInstanceState(outState)
    }

    override fun onMultiWindowModeChanged(isInMultiWindowMode: Boolean) {
        LLog.v()
        super.onMultiWindowModeChanged(isInMultiWindowMode)
    }

    override fun onPictureInPictureModeChanged(isInPictureInPictureMode: Boolean) {
        LLog.v()
        super.onPictureInPictureModeChanged(isInPictureInPictureMode)
    }

    override fun onPrimaryNavigationFragmentChanged(isPrimaryNavigationFragment: Boolean) {
        LLog.v()
        super.onPrimaryNavigationFragmentChanged(isPrimaryNavigationFragment)
    }

    override fun onPause() {
        LLog.v()
        super.onPause()
    }

    override fun onStop() {
        LLog.v()
        super.onStop()
    }

    override fun onDestroyView() {
        LLog.v()
        super.onDestroyView()
    }

    override fun onDestroy() {
        LLog.v()
        super.onDestroy()
    }

    override fun onDetach() {
        LLog.v()
        super.onDetach()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        LLog.v()
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        LLog.v()
        super.onPrepareOptionsMenu(menu)
    }

    override fun onDestroyOptionsMenu() {
        LLog.v()
        super.onDestroyOptionsMenu()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        LLog.v()
        return super.onOptionsItemSelected(item)
    }

    override fun onOptionsMenuClosed(menu: Menu) {
        LLog.v()
        super.onOptionsMenuClosed(menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        LLog.v()
        return super.onContextItemSelected(item)
    }
}
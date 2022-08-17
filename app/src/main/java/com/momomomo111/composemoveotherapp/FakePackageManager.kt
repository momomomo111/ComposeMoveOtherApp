package com.momomomo111.composemoveotherapp

import android.content.ComponentName
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.ActivityInfo
import android.content.pm.ApplicationInfo
import android.content.pm.ChangedPackages
import android.content.pm.FeatureInfo
import android.content.pm.InstrumentationInfo
import android.content.pm.PackageInfo
import android.content.pm.PackageInstaller
import android.content.pm.PackageManager
import android.content.pm.PermissionGroupInfo
import android.content.pm.PermissionInfo
import android.content.pm.ProviderInfo
import android.content.pm.ResolveInfo
import android.content.pm.ServiceInfo
import android.content.pm.SharedLibraryInfo
import android.content.pm.VersionedPackage
import android.content.res.Resources
import android.content.res.XmlResourceParser
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.os.UserHandle

class FakePackageManager : PackageManager() {
    override fun getPackageInfo(packageName: String, flags: Int): PackageInfo {
        TODO("Not yet implemented")
    }

    override fun getPackageInfo(versionedPackage: VersionedPackage, flags: Int): PackageInfo {
        TODO("Not yet implemented")
    }

    override fun currentToCanonicalPackageNames(packageNames: Array<out String>): Array<String> {
        TODO("Not yet implemented")
    }

    override fun canonicalToCurrentPackageNames(packageNames: Array<out String>): Array<String> {
        TODO("Not yet implemented")
    }

    override fun getLaunchIntentForPackage(packageName: String): Intent? {
        TODO("Not yet implemented")
    }

    override fun getLeanbackLaunchIntentForPackage(packageName: String): Intent? {
        TODO("Not yet implemented")
    }

    override fun getPackageGids(packageName: String): IntArray {
        TODO("Not yet implemented")
    }

    override fun getPackageGids(packageName: String, flags: Int): IntArray {
        TODO("Not yet implemented")
    }

    override fun getPackageUid(packageName: String, flags: Int): Int {
        TODO("Not yet implemented")
    }

    override fun getPermissionInfo(permName: String, flags: Int): PermissionInfo {
        TODO("Not yet implemented")
    }

    override fun queryPermissionsByGroup(
        permissionGroup: String?,
        flags: Int
    ): MutableList<PermissionInfo> {
        TODO("Not yet implemented")
    }

    override fun getPermissionGroupInfo(groupName: String, flags: Int): PermissionGroupInfo {
        TODO("Not yet implemented")
    }

    override fun getAllPermissionGroups(flags: Int): MutableList<PermissionGroupInfo> {
        TODO("Not yet implemented")
    }

    override fun getApplicationInfo(packageName: String, flags: Int): ApplicationInfo {
        TODO("Not yet implemented")
    }

    override fun getActivityInfo(component: ComponentName, flags: Int): ActivityInfo {
        TODO("Not yet implemented")
    }

    override fun getReceiverInfo(component: ComponentName, flags: Int): ActivityInfo {
        TODO("Not yet implemented")
    }

    override fun getServiceInfo(component: ComponentName, flags: Int): ServiceInfo {
        TODO("Not yet implemented")
    }

    override fun getProviderInfo(component: ComponentName, flags: Int): ProviderInfo {
        TODO("Not yet implemented")
    }

    override fun getInstalledPackages(flags: Int): MutableList<PackageInfo> {
        TODO("Not yet implemented")
    }

    override fun getPackagesHoldingPermissions(
        permissions: Array<out String>,
        flags: Int
    ): MutableList<PackageInfo> {
        TODO("Not yet implemented")
    }

    override fun checkPermission(permName: String, packageName: String): Int {
        TODO("Not yet implemented")
    }

    override fun isPermissionRevokedByPolicy(permName: String, packageName: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun addPermission(info: PermissionInfo): Boolean {
        TODO("Not yet implemented")
    }

    override fun addPermissionAsync(info: PermissionInfo): Boolean {
        TODO("Not yet implemented")
    }

    override fun removePermission(permName: String) {
        TODO("Not yet implemented")
    }

    override fun checkSignatures(packageName1: String, packageName2: String): Int {
        TODO("Not yet implemented")
    }

    override fun checkSignatures(uid1: Int, uid2: Int): Int {
        TODO("Not yet implemented")
    }

    override fun getPackagesForUid(uid: Int): Array<String>? {
        TODO("Not yet implemented")
    }

    override fun getNameForUid(uid: Int): String? {
        TODO("Not yet implemented")
    }

    override fun getInstalledApplications(flags: Int): MutableList<ApplicationInfo> {
        return mutableListOf()
    }

    override fun isInstantApp(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isInstantApp(packageName: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun getInstantAppCookieMaxBytes(): Int {
        TODO("Not yet implemented")
    }

    override fun getInstantAppCookie(): ByteArray {
        TODO("Not yet implemented")
    }

    override fun clearInstantAppCookie() {
        TODO("Not yet implemented")
    }

    override fun updateInstantAppCookie(cookie: ByteArray?) {
        TODO("Not yet implemented")
    }

    override fun getSystemSharedLibraryNames(): Array<String>? {
        TODO("Not yet implemented")
    }

    override fun getSharedLibraries(flags: Int): MutableList<SharedLibraryInfo> {
        TODO("Not yet implemented")
    }

    override fun getChangedPackages(sequenceNumber: Int): ChangedPackages? {
        TODO("Not yet implemented")
    }

    override fun getSystemAvailableFeatures(): Array<FeatureInfo> {
        TODO("Not yet implemented")
    }

    override fun hasSystemFeature(featureName: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun hasSystemFeature(featureName: String, version: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun resolveActivity(intent: Intent, flags: Int): ResolveInfo? {
        TODO("Not yet implemented")
    }

    override fun queryIntentActivities(intent: Intent, flags: Int): MutableList<ResolveInfo> {
        TODO("Not yet implemented")
    }

    override fun queryIntentActivityOptions(
        caller: ComponentName?,
        specifics: Array<out Intent>?,
        intent: Intent,
        flags: Int
    ): MutableList<ResolveInfo> {
        TODO("Not yet implemented")
    }

    override fun queryBroadcastReceivers(intent: Intent, flags: Int): MutableList<ResolveInfo> {
        TODO("Not yet implemented")
    }

    override fun resolveService(intent: Intent, flags: Int): ResolveInfo? {
        TODO("Not yet implemented")
    }

    override fun queryIntentServices(intent: Intent, flags: Int): MutableList<ResolveInfo> {
        TODO("Not yet implemented")
    }

    override fun queryIntentContentProviders(intent: Intent, flags: Int): MutableList<ResolveInfo> {
        TODO("Not yet implemented")
    }

    override fun resolveContentProvider(authority: String, flags: Int): ProviderInfo? {
        TODO("Not yet implemented")
    }

    override fun queryContentProviders(
        processName: String?,
        uid: Int,
        flags: Int
    ): MutableList<ProviderInfo> {
        TODO("Not yet implemented")
    }

    override fun getInstrumentationInfo(className: ComponentName, flags: Int): InstrumentationInfo {
        TODO("Not yet implemented")
    }

    override fun queryInstrumentation(
        targetPackage: String,
        flags: Int
    ): MutableList<InstrumentationInfo> {
        TODO("Not yet implemented")
    }

    override fun getDrawable(
        packageName: String,
        resid: Int,
        appInfo: ApplicationInfo?
    ): Drawable? {
        TODO("Not yet implemented")
    }

    override fun getActivityIcon(activityName: ComponentName): Drawable {
        TODO("Not yet implemented")
    }

    override fun getActivityIcon(intent: Intent): Drawable {
        TODO("Not yet implemented")
    }

    override fun getActivityBanner(activityName: ComponentName): Drawable? {
        TODO("Not yet implemented")
    }

    override fun getActivityBanner(intent: Intent): Drawable? {
        TODO("Not yet implemented")
    }

    override fun getDefaultActivityIcon(): Drawable {
        TODO("Not yet implemented")
    }

    override fun getApplicationIcon(info: ApplicationInfo): Drawable {
        TODO("Not yet implemented")
    }

    override fun getApplicationIcon(packageName: String): Drawable {
        TODO("Not yet implemented")
    }

    override fun getApplicationBanner(info: ApplicationInfo): Drawable? {
        TODO("Not yet implemented")
    }

    override fun getApplicationBanner(packageName: String): Drawable? {
        TODO("Not yet implemented")
    }

    override fun getActivityLogo(activityName: ComponentName): Drawable? {
        TODO("Not yet implemented")
    }

    override fun getActivityLogo(intent: Intent): Drawable? {
        TODO("Not yet implemented")
    }

    override fun getApplicationLogo(info: ApplicationInfo): Drawable? {
        TODO("Not yet implemented")
    }

    override fun getApplicationLogo(packageName: String): Drawable? {
        TODO("Not yet implemented")
    }

    override fun getUserBadgedIcon(drawable: Drawable, user: UserHandle): Drawable {
        TODO("Not yet implemented")
    }

    override fun getUserBadgedDrawableForDensity(
        drawable: Drawable,
        user: UserHandle,
        badgeLocation: Rect?,
        badgeDensity: Int
    ): Drawable {
        TODO("Not yet implemented")
    }

    override fun getUserBadgedLabel(label: CharSequence, user: UserHandle): CharSequence {
        TODO("Not yet implemented")
    }

    override fun getText(
        packageName: String,
        resid: Int,
        appInfo: ApplicationInfo?
    ): CharSequence? {
        TODO("Not yet implemented")
    }

    override fun getXml(
        packageName: String,
        resid: Int,
        appInfo: ApplicationInfo?
    ): XmlResourceParser? {
        TODO("Not yet implemented")
    }

    override fun getApplicationLabel(info: ApplicationInfo): CharSequence {
        TODO("Not yet implemented")
    }

    override fun getResourcesForActivity(activityName: ComponentName): Resources {
        TODO("Not yet implemented")
    }

    override fun getResourcesForApplication(app: ApplicationInfo): Resources {
        TODO("Not yet implemented")
    }

    override fun getResourcesForApplication(packageName: String): Resources {
        TODO("Not yet implemented")
    }

    override fun verifyPendingInstall(id: Int, verificationCode: Int) {
        TODO("Not yet implemented")
    }

    override fun extendVerificationTimeout(
        id: Int,
        verificationCodeAtTimeout: Int,
        millisecondsToDelay: Long
    ) {
        TODO("Not yet implemented")
    }

    override fun setInstallerPackageName(targetPackage: String, installerPackageName: String?) {
        TODO("Not yet implemented")
    }

    override fun getInstallerPackageName(packageName: String): String? {
        TODO("Not yet implemented")
    }

    override fun addPackageToPreferred(packageName: String) {
        TODO("Not yet implemented")
    }

    override fun removePackageFromPreferred(packageName: String) {
        TODO("Not yet implemented")
    }

    override fun getPreferredPackages(flags: Int): MutableList<PackageInfo> {
        TODO("Not yet implemented")
    }

    override fun addPreferredActivity(
        filter: IntentFilter,
        match: Int,
        set: Array<out ComponentName>?,
        activity: ComponentName
    ) {
        TODO("Not yet implemented")
    }

    override fun clearPackagePreferredActivities(packageName: String) {
        TODO("Not yet implemented")
    }

    override fun getPreferredActivities(
        outFilters: MutableList<IntentFilter>,
        outActivities: MutableList<ComponentName>,
        packageName: String?
    ): Int {
        TODO("Not yet implemented")
    }

    override fun setComponentEnabledSetting(
        componentName: ComponentName,
        newState: Int,
        flags: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getComponentEnabledSetting(componentName: ComponentName): Int {
        TODO("Not yet implemented")
    }

    override fun setApplicationEnabledSetting(packageName: String, newState: Int, flags: Int) {
        TODO("Not yet implemented")
    }

    override fun getApplicationEnabledSetting(packageName: String): Int {
        TODO("Not yet implemented")
    }

    override fun isSafeMode(): Boolean {
        TODO("Not yet implemented")
    }

    override fun setApplicationCategoryHint(packageName: String, categoryHint: Int) {
        TODO("Not yet implemented")
    }

    override fun getPackageInstaller(): PackageInstaller {
        TODO("Not yet implemented")
    }

    override fun canRequestPackageInstalls(): Boolean {
        TODO("Not yet implemented")
    }
}

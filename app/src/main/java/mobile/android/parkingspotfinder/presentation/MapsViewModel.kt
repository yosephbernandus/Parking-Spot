package mobile.android.parkingspotfinder.presentation

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MapsViewModel: ViewModel() {

    var state by mutableStateOf(MapState())
}
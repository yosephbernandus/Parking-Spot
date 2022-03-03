package mobile.android.parkingspotfinder.domain.repository

import kotlinx.coroutines.flow.Flow
import mobile.android.parkingspotfinder.domain.model.ParkingSpot

interface ParkingSpotRepository {

    suspend fun insertParkingSpot(spot: ParkingSpot)

    suspend fun deleteParkingSpot(spot: ParkingSpot)

    suspend fun getParkingSpots(): Flow<List<ParkingSpot>>
}
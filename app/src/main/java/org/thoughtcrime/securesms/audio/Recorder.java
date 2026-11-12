package org.thoughtcrime.securesms.audio;

import android.os.ParcelFileDescriptor;

import java.io.IOException;

/**
 * Simple abstraction of the interface for the original voice note recording and the new.
 */
public interface Recorder {
  void start(ParcelFileDescriptor fileDescriptor) throws IOException;
  void stop();

  /**
   * Temporarily stops capturing audio without finalizing the output. Audio captured after
   * {@link #resume()} is appended to the same stream.
   */
  void pause();

  /**
   * Resumes capturing audio after a call to {@link #pause()}.
   */
  void resume();
}

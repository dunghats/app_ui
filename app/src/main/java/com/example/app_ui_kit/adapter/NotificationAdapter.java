//package com.example.app_ui_kit.adapter;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.app_ui_kit.R;
//
//
//
//public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewHolder> {
//
//    Context context;
//    ArrayList<NotificationModel> notificationModels;
//
//    public NotificationAdapter(Context context, ArrayList<NotificationModel> notificationModels) {
//        this.context = context;
//        this.notificationModels = notificationModels;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(context).inflate(R.layout.item_row, parent, false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        NotificationModel notificationModels = notificationModels.get(position);
//        holder.ivAvt.setImageResource(notificationModels.getImage());
//        holder.tvTitle.setText(notificationModels.getTitle());
//        holder.tvTime.setText(notificationModels.getTime() + "  |");
//        holder.tvName.setText(notificationModels.getName());
//    }
//
//    @Override
//    public int getItemCount() {
//        return notificationModels.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//
//        ImageView ivAvt, ivImg;
//        TextView tvTitle, tvTime, tvName;
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//
//            ivAvt = itemView.findViewById(R.id.ivAvt);
//            tvTitle = itemView.findViewById(R.id.tvTitle);
//            tvTime = itemView.findViewById(R.id.tvTime);
//            tvName = itemView.findViewById(R.id.tvName);
//            ivImg = itemView.findViewById(R.id.img1);
//        }
//    }
//}